import java.io.*;

public class Main {

    
      public static void main(String[] args) throws IOException {
        
       String fileName = "Root/files//answer.txt";
       FileInputStream fis = new FileInputStream(fileName);
       int i;
       while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }  
        
       fis.close();     
      System.out.println(i);


    }
    
}