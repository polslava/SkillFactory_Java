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
        if (toLine!=line && toColumn!=column)  //движение не в туже клетку
        {
            if (toLine >= 0 && toLine < 8 && toColumn >= 0 && toColumn < 8)  //движение в рамках доски
            {
                if (toLine == (line + 2) && toColumn == (column + 1) //движение буквой Г и проверка атаки или свободного поля
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)) {
                    return true;
                } else if ((toLine == (line + 2) && toColumn == (column - 1))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                } else if ((toLine == (line + 1) && toColumn == (column + 2))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                } else if ((toLine == (line + 1) && toColumn == (column - 2))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                }else if ((toLine == (line - 2) && toColumn == (column - 1))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                }else if ((toLine == (line - 2) && toColumn == (column + 1))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                } else if ((toLine == (line - 1) && toColumn == (column - 2))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
                    return true;
                }else if ((toLine == (line - 1) && toColumn == (column + 2))
                        &&isClearHorse(chessBoard,line,column,toLine,toColumn)){
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

    private boolean isClearHorse(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.board[toLine][toColumn]==null ||
        chessBoard.board[toLine][toColumn].getColor()!=chessBoard.board[line][column].getColor())
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
