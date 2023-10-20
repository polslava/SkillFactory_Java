public class Horse extends ChessPiece{

    public Horse(String color) {
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
                if (toLine == (line + 2) && toColumn == (column + 1)) {
                    return true;
                } else if (toLine == (line + 2) && toColumn == (column - 1)) {
                    return true;
                } else if (toLine == (line + 1) && toColumn == (column + 2)) {
                    return true;
                } else if (toLine == (line + 1) && toColumn == (column - 2)) {
                    return true;
                }else if (toLine == (line - 2) && toColumn == (column - 1)) {
                    return true;
                }else if (toLine == (line - 2) && toColumn == (column + 1)) {
                    return true;
                } else if (toLine == (line - 1) && toColumn == (column - 2)) {
                    return true;
                }else if (toLine == (line - 1) && toColumn == (column + 2)) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }else {
            return false;
        }

    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
