import java.util.Arrays;

public class Print {
        // Write your code here
        public void print (int i) {
            System.out.println(i);
        }
        public void print (String l)
        {
            System.out.println(l);
        }
        public void print(int[] array)
        {
            String text = ""+array[0];
            for(int i=1;i< array.length;i++)
            {
                text = text +" "+array[i];
            }
            System.out.println(text);
        }
        public void print(String[] array1)
        {
            String text = ""+array1[0];
            for(int i=1;i< array1.length;i++)
            {
                text = text +" "+array1[i];
            }
            System.out.println(text);
        }


}
