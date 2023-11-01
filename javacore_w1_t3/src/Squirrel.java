public class Squirrel {
    public int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index){
        return this.nuts[index];
    }
    public int maxNuts()
    {
        int sum=0;
        int N = nuts.length;
        for (int i=0;i<N;i=i+1)
        {
            if (i==0 && N==1)
            {sum = sum+ getNuts(i);} else
            if (i==0 && getNuts(i)>0 &&  getNuts(i+1) >0/*&&getNuts(i)>getNuts(i+1)*/)
                {sum = sum+ getNuts(i)+getNuts(i+1);
                i=i+1;
                }
            /*else if (i==0 && getNuts(i)>0 &&getNuts(i+1)>0&& getNuts(i)==getNuts(i+1))
                {sum = sum+ getNuts(i)+getNuts(i+1);
                i=i+1;}*/
            else if (i==0 && getNuts(i)>0 &&getNuts(i+1)<0)
                {sum = sum+ getNuts(i);}
            else if (i==0 && getNuts(i)<0 &&getNuts(i+1)>0)
                {sum = sum+ getNuts(i+1);
                i=i+1;}
            else if (i<N-1 && getNuts(i)>getNuts(i+1))
                {sum = sum+ getNuts(i);

                }
            else if (i<N-1 && getNuts(i)<getNuts(i+1))
                {sum = sum+ getNuts(i+1);
                i=i+1;}
            else if (i<N-1 && (getNuts(i)==getNuts(i+1)) && getNuts(i)>0)
            {sum = sum+ getNuts(i)+ getNuts(i+1);
                i=i+1;}
            else if (i<N-1 && (getNuts(i)==getNuts(i+1)) && getNuts(i)<0)
            {sum = sum+ getNuts(i+1);
                i=i+1;}
            else if (i==(N-1)&& getNuts(i)<0)
                {sum = sum;}
            else if (i==(N-1)&& getNuts(i)>0)
            {sum = sum+ getNuts(i);}
            if (sum<0) {sum=0;}
        }
        return sum;
    }
}
