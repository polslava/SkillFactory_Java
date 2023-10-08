import java.util.Arrays;

public class Separator {
    public  int[] array ; //= new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public
     Separator(int[] array) //для прохождения тестера не хватало конструктора класса
    {
this.array = array;
    }
    public int[] even(){
        int[] ar_1 = new int[array.length];
        int i1=0;
        for (int i=0;i<array.length;i=i+1)
        {
            if (array[i]%2==0)
            {

                ar_1[i1]=array[i];
                i1=i1+1;
            }
        }
        int[] copy = Arrays.copyOf(ar_1, i1);
        return copy;
    }
    public int[] odd(){
        int[] ar_1 = new int[array.length];
        int i1=0;
        for (int i=0;i<array.length;i=i+1)
        {
            if (array[i]%2!=0)
            {

                ar_1[i1]=array[i];
                i1=i1+1;
            }
        }
        int[] copy = Arrays.copyOf(ar_1, i1);
        return copy;
    }

}
