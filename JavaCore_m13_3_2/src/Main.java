public class Main {
    public static class Adv extends Thread {
        @Override
        public void run() {
            Advertisement ad = new Advertisement();
            ad.show();
        }
    }
    // Lunch the show() method from the class Advertisement
    // (it's hidden) in a new Thread
    public static void main(String[] args){
        Adv adv1 = new Adv();
        adv1.start();
    }

}