import java.util.Arrays;
import java.util.OptionalInt;

public class LimitingRectangle {
    public static int point[][]; // = {{-1, -2}, {3, 4}};

    int minX =0;
    int maxX =0;
    int minY =0;
    int maxY =0;
    public LimitingRectangle(int point[][]) {
        this.point = point;
    }

    public int getWidth()
    {
        int width=0;
        int[] pointX = new int[point.length];
        for (int i=0; i< point.length;i++)
        {
            pointX[i]=point[i][0];
        }
          minX = Arrays.stream(pointX).min().getAsInt();
          maxX = Arrays.stream(pointX).max().getAsInt();
        //width = this.point[0][0]-this.point[1][0];
        width = maxX - minX;
        return width;
    }
    public int getHeight()
    {
        int height = 0;
        int[] pointY = new int[point.length];
        for (int i=0; i< point.length;i++)
        {
            pointY[i]=point[i][1];
        }
         minY = Arrays.stream(pointY).min().getAsInt();

        maxY = Arrays.stream(pointY).max().getAsInt();

        //height = this.point[0][1]-this.point[1][1];
        height = maxY-minY;
        return height;
    }
    public String getBorders()
    {
        String ar_str = "";


        //ar_str = "{{"+this.point[0][0]+","+this.point[0][1]+"},{"+this.point[1][0]+","+this.point[1][1]+"}}";

        //ar_str = "{{"+minX+","+minY+"},{"+maxX+","+maxY+"}}";

        //ar_str = "-15"+","+"10"+","+"13"+","+"-14";
        ar_str = minY+", "+maxY+", "+minX+", "+maxX;

        return ar_str;
    }
}
