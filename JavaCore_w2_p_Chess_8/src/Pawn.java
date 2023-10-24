public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;

    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine!=line ) //движение не в туже клетку
             {
            if (toLine >= 0 && toLine < 8 && toColumn==column) //движение в рамках доски
                {

                if (((toLine == line+2)&&(line==1)&& (this.getColor()=="White") //первый шаг на две клетки
                            && chessBoard.board[line+2][column]==null && chessBoard.board[line+1][column]==null) //проверка отсутствия других фигур
                        ||((toLine == line-2)&& (line==6)&& (this.getColor()=="Black") //первый шаг на две клетки
                             && chessBoard.board[line-2][column]==null && chessBoard.board[line-1][column]==null //проверка отсутствия других фигур
                )){
                    return true;} else
                if (((toLine==line+1)&& (this.getColor()=="White")  // шаг на одну клетку
                        && chessBoard.board[line+1][column]==null) //проверка отсутствия других фигур
                    ||((toLine == line-1)&& (this.getColor()=="Black")  // шаг на одну клетку
                        && chessBoard.board[line-1][column]==null)) //проверка отсутствия других фигур
                    { return true;} else {return false;}
                //проверял порядок ходов, где белые сверху массива, работает в тестере

                    } else

                 if (toLine >= 0 && toLine < 8 && // ход на клетку с противников - почти атака
                 (((toLine==line+1)&& (this.getColor()=="White")
                         && (chessBoard.board[line+1][column+1].getColor()!="White"|| // поиск противника на правой стороне
                         chessBoard.board[line+1][column-1].getColor()!="White")) // поиск противника на левой стороне
                         ||((toLine == line-1)&& (this.getColor()=="Black")
                         && (chessBoard.board[line-1][column+1].getColor()!="Black"|| // поиск противника на правой стороне
                         chessBoard.board[line-1][column-1].getColor()!="Black"))  // поиск противника на левой стороне
                 ))
                 {return true;}
                    else
                    {return false;}
                } else {return false;}

    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
