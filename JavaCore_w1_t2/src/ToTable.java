public class ToTable {
    public int[] data;
    public int x;
    public int y;
    public  ToTable(int[] data, int x, int y) //та самая инициализация класса
    {
        this.data = data;
        this.x=x;
        this.y=y;
        //без этих значений вызов класса в main даёт пустые значения нового экземпляра класса
    }
    public int[][] resize()
    {
        int k=0;
        int l = 0;
        int arr_1[][] = new int[x][y];
        for (int i=0; i<x;i=i+1) {

            for (int j = 0; j < y; j = j + 1) {
                k=i+j+l; //счётчик для преобразования из линейного в двухмерный массив
                arr_1[i][j]=data[k];

            }

             l =l+1; //дополнительный счётчик для преобразования из линейного в двухмерный массив

        }
        return arr_1;
    }
}
