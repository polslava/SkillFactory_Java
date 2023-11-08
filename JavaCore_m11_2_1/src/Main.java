public class Main {
    public static void main(String[] args) throws
            ArithmeticException /* + */, ArrayIndexOutOfBoundsException /* + */,
            ArrayStoreException /* + */, ClassCastException /* + */,
            NegativeArraySizeException /* + */, NullPointerException /* + */,
            NumberFormatException/* + */, StringIndexOutOfBoundsException /* + */
            {
int a, b, c;
a=1;
b=0;
int[] ar1 = new int[2];
String str = "String";
String str1;
//c=a/b; +ArithmeticException
// ar1[10]=0; +ArrayIndexOutOfBoundsException
//ar1[10]= Integer.parseInt("null ,1"); +NumberFormatException
//int[] ar2 = new int[-2]; +NegativeArraySizeException
//ar1[null]=0; не компилирует на ArrayStoreException
//  str1 = str.substring(str.length()+1); + StringIndexOutOfBoundsException

      /* Number[] ar2= new Double[2];
               ar2[0]=new Integer(4);*/ // +ArrayStoreException не понял принципа
/*Object i = Integer.valueOf(42);
String s = (String)i;*/ // +ClassCastException не понял принципа
      /*          Object obj = null;
                obj.hashCode();*/ // + NullPointerException не понял принципа
            }
}