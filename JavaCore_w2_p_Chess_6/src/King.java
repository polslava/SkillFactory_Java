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
        /*if (toLine!=line && toColumn!=column) {*/
            if (toLine >= 0 && toLine < 8 && toColumn >= 0 && toColumn < 8) {
                if (
                        ((toColumn == column-1)&&((toLine==line-1)||(toLine==line-0)||(toLine==line+1)))
                        ||((toColumn == column-0)&&((toLine==line-1)||(toLine==line+1)))
                        ||((toColumn == column+1)&&((toLine==line-1)||(toLine==line-0)||(toLine==line+1)))

               // && (!isUnderAttack( chessBoard,  toLine,  toColumn))
                )
                { return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        /*}else {
            return false;
        }*/
        //не сдано
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
