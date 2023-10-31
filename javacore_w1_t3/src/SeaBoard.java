public class SeaBoard {



    private String[][] field = new String[10][10];
    public void SeaBoard()
    {
        FirstField();
    }
    public void FirstField() {
        for (int i = 0; i < 10; i = i + 1) {
            for (int j = 0; j < 10; j = j + 1) {
                field[i][j] = ".";
            }
        }
    }
    public String[][] getField() {
        String[][] field_1 = new String[10][10];
        for (int i = 0; i < 10; i = i + 1) {
            for (int j = 0; j < 10; j = j + 1) {
                field_1[i][j] = check(i,j);
            }
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
        if (field[line][column] == ".")
        {
            result= ".";
        } else if (field[line][column] == "m") {
            result= "#";
        }else if (field[line][column] == "h" || field[line][column] == "d") {
            result= "x";
        }
        return result;
    }
}
