import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public int getMul() throws IOException {
        FileInputStream fis = new FileInputStream("src//data.txt");
        int i = fis.read();
        StringBuilder result = new StringBuilder();
        while(i != -1) {
            result.append((char)i);
            i = fis.read();
        }
        fis.close();
        int N=result.length();
        int[] retEnts=new int[10];
        int r=0;
        int retEnt=0;
        for (int i2=0; i2<N;i2=i2+1)
        {

            if (i2!=N-1)
        {if (result.substring(i2,i2+1).equals("\n")){
            retEnt=retEnt+1;
            retEnts[r]=i2;
            r=r+1;
        }}else{retEnt=retEnt+1;
            retEnts[r]=i2+1;}}
        int retEntsN = r;
        int N1 = Integer.parseInt(result.substring(0,retEnts[0]));
        String str2 = result.substring(retEnts[0]+1,retEnts[1]);
        int N2= str2.length();
        int space = 0;
        int s = 0;
        int[] Spaces=new int[10];
        for (int i3 = 0; i3<N2; i3=i3+1)
        {
            if (i3!=N2-1)
            {if (str2.substring(i3,i3+1).equals(" ")){
                space=space+1;
                Spaces[s]=i3;
                s=s+1;
            }}else{space=space+1;
                Spaces[s]=i3+1;}
        }
        String[] str2_s = new String[10];
        int s2=0;
        for (int i4=0;i4<space;i4=i4+1){

            if(i4<Spaces[i4]) {
                str2_s[i4] = str2.substring(s2, Spaces[i4]);
                s2=Spaces[i4]+1;
            } /*else if (i4>Spaces[space]) {
                str2_s[i4] = str2.substring(s2+1, N2);
                s2 = N2;
            }*/

            }
        int[] div = new int[10];
        for (int i5=0; i5<space;i5=i5+1) {
             div[i5] = Integer.parseInt(str2_s[i5]);
         }
        int mul = 1;
        for (int j = 1; j<= N1; j=j+1){
            for (int k=0;k<space;k=k+1) {
                if (j % div[k] ==0) {
                    mul = mul * j;
                }
            }
        }
        return mul;
        }
    }


