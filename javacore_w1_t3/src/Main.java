
public class Main {
    public static void main(String[] args) {
/*
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.getField();


        Arrays.deepToString(game.getField());
                                         ^
      game.checkGame();

        symbol:   method checkGame()
        game.makeMove(1, 1);

        Arrays.deepToString(game.getField());
                                         ^
       game.makeMove(1, 1);

        game.makeMove(1, 2);

       Arrays.deepToString(game.getField());

        game.makeMove(2, 2);

        game.makeMove(3, 1);
game.makeMove(3, 3);
game.makeMove(2, 1);
 Arrays.deepToString(game.getField());

        game.makeMove(1, 1);

        game.makeMove(3, 3);

        game.makeMove(1, 2);

        game.makeMove(3, 2);

        game.makeMove(2, 2);

       game.makeMove(3, 1);
  Arrays.deepToString(game.getField());

        game.makeMove(2, 2);

        game.makeMove(3, 1);

        game.makeMove(3, 2);

        game.makeMove(2, 1);
    game.makeMove(1, 2);

       Arrays.deepToString(game.getField());

        game.makeMove(1, 1);

        game.makeMove(2, 2);

        game.makeMove(1, 2);

        game.makeMove(1, 3);

        game.makeMove(2, 1);
           game.makeMove(3, 1);
                  Arrays.deepToString(game.getField());

        game.makeMove(2, 2);

        game.makeMove(1, 1);

        game.makeMove(3, 1);

        game.makeMove(1, 3);

        game.makeMove(1, 2);

        game.makeMove(3, 2);

        game.makeMove(2, 1);

        game.makeMove(2, 3);
         game.makeMove(3, 3);
                 Arrays.deepToString(game.getField());
                  game.makeMove(1, 1);
                  Arrays.deepToString(game.getField());
                  game.checkGame();
                  game.makeMove(1, 1);
                  Arrays.deepToString(game.getField());
                 game.makeMove(1, 1);

        game.makeMove(1, 2);
             Arrays.deepToString(game.getField());
               game.makeMove(2, 2);
            game.makeMove(3, 1);
            game.makeMove(3, 3);
                 game.makeMove(2, 1);
                Arrays.deepToString(game.getField());
                   game.makeMove(1, 1);
            game.makeMove(3, 3);
          game.makeMove(1, 2);
         game.makeMove(3, 2);
        game.makeMove(2, 2);
         game.makeMove(3, 1);
          Arrays.deepToString(game.getField());
           */
//===============================

      /*  SeaBoard board = new SeaBoard();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        board.getField();
*/

        SeaBoard seaBoard = new SeaBoard();
        seaBoard.shoot(2, 0, "h");
                seaBoard.shoot(2, 8, "d");
       // Arrays.deepToString(seaBoard.getField());
          seaBoard.shoot(6, 9, "h");
        seaBoard.shoot(2, 2, "m");
        seaBoard.shoot(0, 0, "m");
        seaBoard.shoot(5, 2, "m");
        seaBoard.shoot(7, 0, "h");
        seaBoard.shoot(7, 1, "h");
        seaBoard.shoot(7, 2, "h");
        seaBoard.shoot(7, 3, "d");
        seaBoard.shoot(9, 7, "h");
        seaBoard.shoot(8, 7, "d");
         seaBoard.shoot(2, 1, "d");
         seaBoard.getField();



//=============================
        //Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        //System.out.println(s.maxNuts());
        ///Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
        //System.out.println(s2.maxNuts());

        /*Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        String res = s.getNuts(3) + "";
        res += s.maxNuts();*/
        /*Squirrel s2 = new Squirrel(new int[] {1, -2, -4, 7, 3, -2, -2, 1, -1});
        System.out.println( s2.maxNuts() );
        Squirrel s3 = new Squirrel(new int[] {-2, 2, 4, -6, -2, -1, -2, 1});
        System.out.println( s3.maxNuts());
        System.out.println( (new Squirrel(new int[] {1})).maxNuts());
        System.out.println( (new Squirrel(new int[] {-1})).maxNuts());
        System.out.println( (new Squirrel(new int[] {1, -2})).maxNuts());
        System.out.println( (new Squirrel(new int[] {1, -2, 4, 6, 3, -2, -2, -3, -1})).maxNuts());
        System.out.println( (new Squirrel(new int[] {1, 1, 1, 1, 1})).maxNuts());
        System.out.println( (new Squirrel(new int[] {1, 1, 1, 1, -1})).maxNuts());
        System.out.println( (new Squirrel(new int[] {1, -1, 2, -2, -7, -7, 2, 1})).maxNuts());
*/

    }
}