import static java.lang.Math.*;
public class Bishop extends ChessPiece{
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine!=line && toColumn!=column)  //движение не в туже клетку
        {
            if (toLine >= 0 && toLine < 8 && toColumn >= 0 && toColumn < 8) {
                if ((((toLine -line) == (toColumn -column )) // движение по диагонали вверх
                         ||
                ((toLine -line) == -1*(toColumn -column )))// движение по диагонали вниз
                    &&isClearDiagonal(chessBoard,line,column,toLine,toColumn) //проверка чистого пути и атаки
                )
                {
                    return true;}
                else {
                    return false;}

            }else {
                return false;}
        }
                    else {
                    return false;}

    }

    private boolean isClearDiagonal(ChessBoard chessBoard, int a1, int b1, int a2, int b2) {
        int n=0;
        int m=0;
        boolean isClear = true;
        for (int i = 1;i<=Math.abs(a2-a1);i=i+1){ //проверка наличия мешающих ходу фигур
            if(a2>a1)
            {n=a1+i;
                if(b2>b1)
                {m=b1+i;}else {m=b1-i;}
            }else{
                n=a1-i;
                if(b2>b1)
                {m=b1+i;}else {m=b1-i;}}
            if (chessBoard.board[n][m]==null)
            {isClear=true;}
            else
            {
                if (n==a2 && m==b2
                        && chessBoard.board[a2][b2].getColor()!=chessBoard.board[a1][b1].getColor())
                {isClear=true;} else {isClear=false;}//проверка противника в конечной точке
            }

        }
        return isClear;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
