public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {


        if (toLine >= 0 && toLine < 8 && toColumn >= 0 && toColumn < 8) //движение в рамках доски
        {

            if (
                    (((toLine != line) && (toColumn == column ))//движение не в туже клетку и по вертикали
                        &&isClearLine(chessBoard,line,column,toLine,toColumn)) //вызов проверки чистой дороги вместе с попыткой атаки

                    || (((toLine == line) && (toColumn != column ))//движение не в туже клетку
                &&isClearColumn(chessBoard,line,column,toLine,toColumn)) //вызов проверки чистой дороги вместе с попыткой атаки
               // (chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())) //проверка противника в конечной точке (chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())) //проверка противника в конечной точке
            )
            { return true;}
            else {
                return false;}
            } else {
            return false;
        }

    }
    boolean isClearLine(ChessBoard chessBoard,int a1, int b1, int a2, int b2){ //проверка по строке
        int n=0;
        boolean isClear = true;
        for (int i = 1;i<=Math.abs(a2-a1);i=i+1){ //проверка наличия мешающих ходу фигур
            if(a2>a1){n=a1+i;}else{n=a1-i;}
            if (chessBoard.board[n][b1]==null)
            {isClear=true;}
            else
            {
             if (n==a2
             && chessBoard.board[a2][b2].getColor()!=chessBoard.board[a1][b1].getColor())
             {isClear=true;} else {isClear=false;}//проверка противника в конечной точке
            }

            }
        return isClear;
        }
    boolean isClearColumn(ChessBoard chessBoard,int a1, int b1, int a2, int b2){ //проверка по колонке
        int n=0;
        boolean isClear = true;
        for (int i = 1;i<=Math.abs(b2-b1);i=i+1){ //проверка наличия мешающих ходу фигур
            if(b2>b1){n=b1+i;}else{n=b1-i;}
            if (chessBoard.board[a1][n]==null)
            {isClear=true;}
            else {
                if (n==b2
                        && chessBoard.board[a2][b2].getColor()!=chessBoard.board[a1][b1].getColor())
                {isClear=true;} else {isClear=false;}//проверка противника в конечной точке
            }

        }
        return isClear;
    }
    @Override
    public String getSymbol() {
        return "R";
    }
}