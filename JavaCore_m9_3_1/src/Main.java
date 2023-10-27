import java.io.File;

public class Main {
    public static void main (String[] args)
    {
        //File file = new File("C:\\Test\\Test.txt");
        //File file = new File("/Users/user/Test/Test.txt");  //не понятна работа с файлами в Linux
        //File file = new File("~/Test/Test.txt");  //не понятна работа с файлами в Linux
        String home = System.getProperty("user.home");
        File file = new File(home + File.separator + "Test" + File.separator + "Testing" + File.separator + "Java.txt");

        long length = file.length(); //(1024*1024); //MB
        System.out.println(length);//6
    }
}
