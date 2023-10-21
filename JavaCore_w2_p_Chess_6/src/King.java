public class King extends ChessPiece{
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine!=line && toColumn!=column) {
            if (toLine > 0 && toLine < 8 && toColumn > 0 && toColumn < 8) {
                if ((((toLine == line + 1) || (toLine == line - 1))
                        && ((toColumn <= column + 1) || (toColumn == column - 1)))
                        ||
                    ((toLine == line )
                        && ((toColumn == column + 1) || (toColumn == column - 1))))
                { return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }else {
            return false;
        }//не сдано
    }

    @Override
    public String getSymbol() {
        return "K";
    }
}
