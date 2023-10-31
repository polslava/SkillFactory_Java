public class TicTacToe {
    /*public String[][] field = new String[3][3];*/
    public String[][] field =   {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
    public void newGame(){
        getField();
    }
    public String[][] getField(){
        for (int i =0;i<field.length;i=i+1)
        {
            /*for (int j =0;j<field.length;j=i+1)
            {

            }*/
            System.out.println("['"+field[i][0]+"','"+field[i][1]+"','"+field[i][0]+"']");
        }
        return field;
    }
    public String checkGame()
    {
        return "";
    }
    public String makeMove(int x, int y)
    {
        return "";
    }

}
