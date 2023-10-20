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
        if (toLine!=line ) {
            if (toLine > 0 && toLine < 8 && toColumn==column) {

                if (((toLine == line-2)&&(line==6)&& (this.getColor()=="White"))
                        ||((toLine == line+2)&& (line==1)&& (this.getColor()=="Black"))){
                    return true;} else
                        if (((toLine==line-1)&& (this.getColor()=="White"))
                        ||((toLine == line+1)&& (this.getColor()=="Black"))){
                        return true;
                        } else {return false;}
                         //проверял порядок ходов, где белые внизу массива, но тестер даёт ошибку



                /*if (((toLine == line+2)&&(line==1)&& (this.getColor()=="White"))
                        ||((toLine == line-2)&& (line==6)&& (this.getColor()=="Black"))){
                    return true;} else
                if (((toLine==line+1)&& (this.getColor()=="White"))
                        ||((toLine == line-1)&& (this.getColor()=="Black"))){
                    return true;
                } else {return false;} */ //проверял порядок ходов, где белые сверху массива, но тестер даёт ошибку

                    } else {return false;}
                } else {return false;}

    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
