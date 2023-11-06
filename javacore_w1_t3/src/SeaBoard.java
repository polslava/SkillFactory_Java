public class SeaBoard {
//не сдано
//нужен механизм поиска полностью подбитого корабля

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

        field[line][column]=issue; //фиксация хода в ячейку
       if(issue=="d")
       {
           int i=line;

           outerloop1:
               for (int j=column;j<9;j=j+1)
               {
                   if (field[i][j]!="." &&field[i][j]!="m") {
                       this.field[i][j]=issue;
                   } else
                   if (field[i][j]=="." ||field[i][j]=="m"){
                       break outerloop1;}
               }

           outerloop2:

               for (int j=column;j>=0;j=j-1)
               {
                   if (field[i][j]!="." &&field[i][j]!="m") {
                       this.field[i][j]=issue;
                   }else
                   if (field[i][j]=="." ||field[i][j]=="m")
                   { break outerloop2;
                    }
               }

           int j=column;
           outerloop3:
           for ( i=line;i<9;i=i+1)
           {
               if (field[i][j]!="." &&field[i][j]!="m") {
                   this.field[i][j]=issue;
               } else
               if (field[i][j]=="." ||field[i][j]=="m"){
                   break outerloop3;}
           }

           outerloop4:

           for ( i=line;i>=0;i=i-1)
           {
               if (field[i][j]!="." &&field[i][j]!="m") {
                   this.field[i][j]=issue;
               }else
               if (field[i][j]=="." ||field[i][j]=="m")
               { break outerloop4;
               }
           }

       }
    }
    public String check(int line, int column){
        String result="";
    //поиск пустых клеток и клеток раненного и подбитого корабля
            if ((field[line][column] == ".") &&
                    /*((line>0&&(field[line-1][column] == "h" || field[line-1][column] == "d")) || //поиск прямых клеток подбитостей
                            (line<9&&(field[line+1][column] == "h" || field[line+1][column] == "d"))||
                            (column>0&&(field[line][column-1] == "h" || field[line][column-1] == "d"))||
                            (column<9&&(field[line][column+1] == "h" || field[line][column+1] == "d"))
                    ||(line>0&&column>0&&(field[line-1][column-1] == "h" || field[line-1][column-1] == "d")) || //поиск угловых клеток подбитостей
                        (line>0&&column<9&&(field[line-1][column+1] == "h" || field[line-1][column+1] == "d")) ||
                        (line<9&&column>0&&(field[line+1][column-1] == "h" || field[line+1][column-1] == "d")) ||
                            (line<9&&column<9&&(field[line+1][column+1] == "h" || field[line+1][column+1] == "d"))
                    )*/
                    ((line>0&&(field[line-1][column] == "d")) || //поиск прямых клеток подбитостей
                            (line<9&&(field[line+1][column] == "d"))||
                            (column>0&&( field[line][column-1] == "d"))||
                            (column<9&&( field[line][column+1] == "d"))
                            ||(line>0&&column>0&&( field[line-1][column-1] == "d")) || //поиск угловых клеток подбитостей
                            (line>0&&column<9&&( field[line-1][column+1] == "d")) ||
                            (line<9&&column>0&&(field[line+1][column-1] == "d")) ||
                            (line<9&&column<9&&( field[line+1][column+1] == "d"))
                    )
            ){
                result= "#"; //клетки рядом с попаданиями и подбитым кораблём отображены решёткой, а должно быть только рядом
                // с подбитым кораблём (нет механизма поиска полностью подбитого корабля)
            } else
            if (field[line][column] == ".")
            {
                result= "."; //пустые клетки отображены точкой
            } else
            if (field[line][column] == "m" ) {
            result= "#"; //промахи отображены решёткой
        }else if (field[line][column] == "h" || field[line][column] == "d") {
            result= "x"; //попадания и подбитый отображены х
        }
        return result;
    }
}
