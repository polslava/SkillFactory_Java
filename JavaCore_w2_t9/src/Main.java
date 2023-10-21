public class Main {
    public static void main (String[] args){

        /*Square square = new Square(1, "Blue");
        System.out.println( square.getColor().equals("Blue") && square.getHeight() == 1 &&
                square.getLargeDiagonal() == Math.sqrt(2) && square.area() == 1 && square.perimeter() == 4);
        Rectangle rectangle = new Rectangle(1, 3, "Red");
        Rectangle rectangle2 = new Rectangle(3, 1, "Red");
        System.out.println(rectangle.getColor().equals("Red") && rectangle.getHeight() == 1 &&
                rectangle.getLargeDiagonal() == Math.sqrt(10) && rectangle.area() == 3 && rectangle.perimeter() == 8 &&
                rectangle2.getColor().equals("Red") && rectangle2.getHeight() == 1 &&
                rectangle2.getLargeDiagonal() == Math.sqrt(10) && rectangle2.area() == 3 && rectangle2.perimeter() == 8);
*/
       // System.out.println(Math.sin(Math.toRadians(120))); //0.5806111842123143
       // System.out.println((Math.sqrt(3))/2); //0.8660254037844386

        Rhombuses rhombuses = new Rhombuses(1, 60, 120, "Pink");
        Rhombuses rhombuses1 = new Rhombuses(1, 90, 90, "Pink");
        Rhombuses rhombuses2 = new Rhombuses(2, 60, 120, "Pink");
        System.out.println(rhombuses.getColor().equals("Pink"));
        System.out.println(
                rhombuses.getHeight() == Math.sqrt(3) / 2);
        System.out.println(rhombuses.getHeight()); //0.8660254037844387
        System.out.println(
                rhombuses.getLargeDiagonal() > 1.73 &&
                rhombuses.getLargeDiagonal() < 1.74 ); System.out.println(
                rhombuses.area() == Math.sqrt(3) / 2 ); System.out.println(
                rhombuses.perimeter() == 4 ); System.out.println(
                rhombuses1.getColor().equals("Pink") ); System.out.println(
                rhombuses1.getHeight() == 1 ); System.out.println(
                rhombuses1.getLargeDiagonal() > 1.4142 &&
                rhombuses1.getLargeDiagonal() < 1.4143 ); System.out.println(
                rhombuses1.area() == 1 ); System.out.println(
                rhombuses1.perimeter() == 4 ); System.out.println(
                rhombuses2.getColor().equals("Pink") ); System.out.println(
                rhombuses2.getHeight() == 2 * Math.sqrt(3) / 2 ); System.out.println(
                rhombuses2.getLargeDiagonal() > 3.46 &&
                rhombuses2.getLargeDiagonal() < 3.47 ); System.out.println(
                rhombuses2.area() == 2 * Math.sqrt(3) ); System.out.println(
                rhombuses2.perimeter() == 8
        );
        Parallelogram parallelogram = new Parallelogram(1, 2, 60, 120, "Pink");
        Parallelogram parallelogram1 = new Parallelogram(2, 1, 60, 120, "Pink");
        Parallelogram parallelogram2 = new Parallelogram(1, 2, 90, 90, "White");
        Parallelogram parallelogram3 = new Parallelogram(2, 3, 60, 120, "Pink");

        System.out.println( parallelogram.getColor().equals("Pink") );
        System.out.println(
                parallelogram.getHeight() >= 0.86 &&
                parallelogram.getHeight() <= 0.87 );
        System.out.println( parallelogram.getHeight());
        System.out.println(
                parallelogram.getLargeDiagonal() >= 2.64 &&
                parallelogram.getLargeDiagonal() <= 2.65 ); System.out.println(
                parallelogram.area() >= 1.73 &&
                parallelogram.area() <= 1.74 ); System.out.println(
                parallelogram.perimeter() == 6 ); System.out.println(

                parallelogram1.getColor().equals("Pink") );
                System.out.println(
                parallelogram1.getHeight() >= 0.86 &&
                parallelogram1.getHeight() <= 0.87 );
                System.out.println(
                parallelogram1.getLargeDiagonal() >= 2.64 &&
                parallelogram1.getLargeDiagonal() <= 2.65 );
                System.out.println(
                parallelogram1.area() >= 1.73 &&
                parallelogram1.area() <= 1.74 ); System.out.println(
                parallelogram1.perimeter() == 6 ); System.out.println(

                parallelogram2.getColor().equals("White") ); System.out.println(
                parallelogram2.getHeight() == 1 );
                System.out.println(
                parallelogram2.getLargeDiagonal() >= 2.23 &&
                parallelogram2.getLargeDiagonal() <= 2.24 ); System.out.println(
                parallelogram2.area() == 2 ); System.out.println(
                parallelogram2.perimeter() == 6 ); System.out.println(

                parallelogram3.getColor().equals("Pink") ); System.out.println(
                parallelogram3.getHeight() >= 1.73 &&
                parallelogram3.getHeight() <= 1.74 ); System.out.println(
                parallelogram3.getLargeDiagonal() >= 4.35 &&
                parallelogram3.getLargeDiagonal() <= 4.36 ); System.out.println(
                parallelogram3.area() >= 5.19 &&
                parallelogram3.area() <= 5.20 ); System.out.println(
                parallelogram3.perimeter() == 10);
    }
}
//не сдано: в тестере не учитываются по самой длинной диагонали и высота вертикального параллелограмма
