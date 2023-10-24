public class King extends ChessPiece{
    public King(String color) {
        super(color);
    }
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column){
        return false; // в ТЗ не указан признак для проверки
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
                        ((toColumn == column-1)&&((toLine==line-1)||(toLine==line-0)||(toLine==line+1)))
                        ||((toColumn == column-0)&&((toLine==line-1)||(toLine==line+1)))
                        ||((toColumn == column+1)&&((toLine==line-1)||(toLine==line-0)||(toLine==line+1))) //движение в радиусе 1 поля и не в тоже поле

                && (!isUnderAttack( chessBoard,  toLine,  toColumn))
                                && chessBoard.board[toLine][toColumn]==null

                )
                { return true;
                } else {
                    if ( chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())
                    {return true;} else
                    {return false;}
                }
            } else {
                return false;
            }


    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
