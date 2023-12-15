import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double equals;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую цифру: ");
        number1 = scanner.nextDouble();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        System.out.print("\nВведите вторую цифру: ");
        number2 = scanner.nextDouble();
        switch (operation) {
            case '+':
                equals = number1 + number2;
                break;
            case '-':
                equals = number1 - number2;
                break;
            case '*':
                equals = number1 * number2;
                break;
            case '/':
                equals = number1 / number2;
                break;
            default:
                System.out.printf("\nОшибка! Вы ввели не оператор!");
                return;
        }
        System.out.print("\nРезультат: \n");
        System.out.printf(number1 + " " + operation + " " + number2 + " = " + equals);
    }
}
