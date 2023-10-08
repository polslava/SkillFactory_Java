public class ToLine {
    public int[][] data;
    public ToLine(int[][] data)
    {
        this.data = data;
    }
    public int[] resize()
    {
        int l1 = data.length;
        int l2 = data[0].length;
        int k=0;
        int[] arr_1 = new int[l1*l2];
        for (int i=0;i<l1;i++) {
            for (int j = 0; j < l2; j++)
            {
                arr_1[k]=data[i][j];
                k++; //счётчик линейного массива
            }

        }
        return arr_1;
    }
}
