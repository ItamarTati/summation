import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello user welcome to my summation app");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");

        int secondNumber = scanner.nextInt();

        int total = sum(firstNumber, secondNumber);
        System.out.println("Your total value is " + total);

    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}