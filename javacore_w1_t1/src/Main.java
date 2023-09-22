
public class Main {
    public static void main(String[] args) {
     /*Bell bell = new Bell();
     for (int i=0; i<20; i=i+1) {
         System.out.println(bell.sound());
     }*/
        Balance balance = new Balance();
        balance.addLeft(10);
        balance.addRight(9);
        System.out.println(balance.getSituation());

        balance.addLeft(2);
        balance.addRight(9);
        System.out.println(balance.getSituation());
        balance.addLeft(4);
        balance.addRight(4);
        System.out.println(balance.getSituation());


        /*Payer payer = new Payer("Fam","Im", "adr1", "0123");
        System.out.println(payer.toString());

         */
        }
    }
