import java.io.*;

public class Main {

    
    public static void main(String[] args) throws IOException{
/*

The file asciitable.txt is hidden in files directory
you have to count all digits in it.
The number of digits in it is the CODE for the excercise

*/
       String fileName = "Root/files//asciitable.txt";
       FileInputStream fis = new FileInputStream(fileName);
       int i;
int n=0;
       while ((i = fis.read()) != -1) {
                
if ( i>=48 &&  i<=57){
System.out.println((char) i);
    n=n+1;
}
}
       fis.close();     
       System.out.println(n);
}
}