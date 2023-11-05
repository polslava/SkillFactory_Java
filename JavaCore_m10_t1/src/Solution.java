import java.io.*;
import java.nio.charset.StandardCharsets;

public class Solution {
    public void getReceipt() throws IOException {
        // write your code here
       // FileInputStream fileInputStream = new FileInputStream("src//receipt.txt");
        int c; //номер символа
        int semicom=0;
        int retEnt=0;
        int dot=0;
        String res="";
        Reader fis = new FileReader("src//receipt.txt");
        /*long len = new File("src//receipt.txt").length();
        char[] buffer = new char[(int) len];
        int length;*/
        int i = fis.read();
        StringBuilder result = new StringBuilder();
        /*while ((length = fis.read(buffer)) > 0) {
            System.out.println(buffer);
        }*/
        while(i != -1) {
            result.append((char)i);

            i = fis.read();
        }
        fis.close();
        System.out.println(result);
        int[] semicoms=new int[10];
        int s=0;
        int[] retEnts=new int[10];
        int r=0;
        int[] dots=new int[10];
        int d=0;
        int N=result.length();
        for (int i2=0; i2<N;i2=i2+1)
        {
            System.out.print(result.substring(i2,i2+1));
            if (result.substring(i2,i2+1).equals(";")){
                semicom=semicom+1;
                if((semicom%2)==0){
                semicoms[s]=i2;
                s=s+1;}
            }
            if (result.substring(i2,i2+1).equals("\n")){
                retEnt=retEnt+1;
                retEnts[r]=i2;
                r=r+1;
            }
            if (result.substring(i2,i2+1).equals(".")){
                dot=dot+1;
                dots[d]=i2;
                d=d+1;
            }
        }
        System.out.println();
        System.out.println(semicom);
        System.out.println(retEnt);
        System.out.println(dot);
        for (int j=0;j<d;j=j+1){
            System.out.println(result.substring(semicoms[j],dots[j]-semicoms[j]));
            System.out.println(semicoms[j]);
            System.out.println(dots[j]);
        }
    }
}