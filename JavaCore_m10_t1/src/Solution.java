import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

public class Solution {
    public String getReceipt() throws IOException {
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
        //System.out.println(result);
        int[] semicoms1=new int[10];
        int s1=0;
        int[] semicoms2=new int[10];
        int s2=0;
        int[] retEnts=new int[10];
        int r=0;
        int[] dots=new int[10];
        int d=0;
        int N=result.length();
        for (int i2=0; i2<N;i2=i2+1)
        {
            //System.out.print(result.substring(i2,i2+1));
            if (result.substring(i2,i2+1).equals(";")){
                semicom=semicom+1;
                if((semicom%2)==0){
                    semicoms2[s2]=i2;
                    s2=s2+1;}
                else
                {
                    semicoms1[s1]=i2;
                    s1=s1+1;}
            }

            if (result.substring(i2,i2+1).equals(".")){
                dot=dot+1;
                dots[d]=i2;
                d=d+1;
            }
            if (i2!=N-1)
            {if (result.substring(i2,i2+1).equals("\n")){
                retEnt=retEnt+1;
                retEnts[r]=i2;
                r=r+1;
            }}else{retEnt=retEnt+1;
                retEnts[r]=i2+1;}
        }
        /*System.out.println();
        System.out.println(semicom);
        System.out.println(retEnt);
        System.out.println(dot);

         */
        double res_receipt = 0;
        for (int j=0;j<d;j=j+1){

            //System.out.println(semicoms[j]);
            //System.out.println(dots[j]);
            //System.out.println(dots[j]-semicoms[j]);
            //System.out.println(result.substring(semicoms1[j]+1,semicoms2[j]));
            //System.out.println(result.substring(semicoms2[j]+1,retEnts[j]));
            res_receipt = res_receipt+
                    Double.parseDouble(result.substring(semicoms1[j]+1,semicoms2[j]))*
                    Double.parseDouble(result.substring(semicoms2[j]+1,retEnts[j]));
        }
        //DecimalFormat decimalFormat = new DecimalFormat("#,##0.00"); //1,051.40 вместо 1051.40
        //String numberAsString = decimalFormat.format(res_receipt);
        //System.out.println(numberAsString); //250,00
        return String.valueOf(res_receipt)+"0"; //250.0
        //return numberAsString;
    }
}