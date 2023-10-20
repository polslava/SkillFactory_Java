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
        if (toLine!=line && toColumn!=column) {
            if (toLine > 0 && toLine < 8 && toColumn > 0 && toColumn < 8) {
                if (((toLine -line) == (toColumn -column ))||
                ((toLine -line) == -1*(toColumn -column ))) {
                    return true;}
                else {
                    return false;}

            }else {
                return false;}
        }
                    else {
                    return false;}
//не сдано
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
