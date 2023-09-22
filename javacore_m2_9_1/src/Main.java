import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt(); //считывает число
/*Метод next() класса Scanner считывает строку,
а метод charAt(0) позволяет взять первый символ в этой строке.
 так мы получаем операцию, которую нужно выполнить*/
        char operation = scanner.next().charAt(0);
        int operand2 = scanner.nextInt(); //считывает число
        int result =0;
        switch (operation) {
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
        }
        System.out.println(result);
    }
}