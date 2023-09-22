import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        int operand1 =0;
        int operand2 =0;
        int result =0;
        char operation = ' ';
        Scanner scanner = new Scanner(System.in);
         operand1 = scanner.nextInt(); //считывает число
        while (operation != 's') {
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'C':
                    System.out.print("\033[H\033[2J");
                    System.out.print("\033[H\033[J");
                    //System.out.print("\r" + " ");
                    /*System.out.print("33[H33[2J");
                    System.out.flush();*/
                    operand1 = 0;
                    operand2 = 0;
                    result = 0;

                    operand1 = scanner.nextInt(); //считывает число
                    operation = scanner.next().charAt(0);
                    break;
                case 's':
                    System. exit(0);
            }
            operand2 = scanner.nextInt(); //считывает число

            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }
            System.out.println(result);
            operand1 = result;
        }
    }
}