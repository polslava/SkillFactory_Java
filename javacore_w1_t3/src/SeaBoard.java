public class SeaBoard {
//не сдано


    private String[][] field = new String[10][10];
    public SeaBoard()
    {
        FirstField(this.field);
    }
    public void FirstField(String[][] field) {
        for (int i = 0; i < 10; i = i + 1) {
            for (int j = 0; j < 10; j = j + 1) {
                this.field[i][j] = ".";
            }
        }
    }
    public String[][] getField() {
        String[][] field_1 = new String[10][10];
        for (int i = 0; i < 10; i = i + 1) {
            for (int j = 0; j < 10; j = j + 1) {
                field_1[i][j] = check(i,j);
                System.out.print(field_1[i][j]);
            }
            System.out.println();
        }

        return field;
    }
   /*public void SetField(int line, int column, String issue){
        field[line][column]=issue;
   }*/
    public void shoot(int line, int column, String issue){
        field[line][column]=issue;
    }
    public String check(int line, int column){
        String result="";

            if ((field[line][column] == ".") &&
                    ((line>0&&(field[line-1][column] == "h" || field[line-1][column] == "d")) || //поиск прямых клеток подбитостей
                            (line<9&&(field[line+1][column] == "h" || field[line+1][column] == "d"))||
                            (column>0&&(field[line][column-1] == "h" || field[line][column-1] == "d"))||
                            (column<9&&(field[line][column+1] == "h" || field[line][column+1] == "d"))
                    ||(line>0&&column>0&&(field[line-1][column-1] == "h" || field[line-1][column-1] == "d")) || //поиск угловых клеток подбитостей
                        (line>0&&column<9&&(field[line-1][column+1] == "h" || field[line-1][column+1] == "d")) ||
                        (line<9&&column>0&&(field[line+1][column-1] == "h" || field[line+1][column-1] == "d")) ||
                            (line<9&&column<9&&(field[line+1][column+1] == "h" || field[line+1][column+1] == "d"))
                    )){
                result= "#";
            } else
            if (field[line][column] == ".")
            {
                result= ".";
            } else
            if (field[line][column] == "m" ) {
            result= "#";
        }else if (field[line][column] == "h" || field[line][column] == "d") {
            result= "x";
        }
        return result;
    }
}
