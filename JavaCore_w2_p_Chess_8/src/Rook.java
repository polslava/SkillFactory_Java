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
    boolean isClearLine(ChessBoard chessBoard,int line, int column, int toLine, int toColumn){ //проверка по строке
        int n=0;
        boolean isClear = true;
        for (int i = 1;i<=Math.abs(toLine-line);i=i+1){ //проверка наличия мешающих ходу фигур
            if(toLine>line){n=line+i;}else{n=line-i;}
            if (chessBoard.board[n][column]==null)
            {isClear=true;}
            else
            {
             if (n==toLine
             && chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())
             {isClear=true;} else {isClear=false;}//проверка противника в конечной точке
            }

            }
        return isClear;
        }
    boolean isClearColumn(ChessBoard chessBoard,int line, int column, int toLine, int toColumn){ //проверка по колонке
        int n=0;
        boolean isClear = true;
        for (int i = 1;i<=Math.abs(toColumn-column);i=i+1){ //проверка наличия мешающих ходу фигур
            if(toColumn>column){n=column+i;}else{n=column-i;}
            if (chessBoard.board[line][n]==null)
            {isClear=true;}
            else {
                if (n==toColumn
                        && chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())
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