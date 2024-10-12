import java.util.Scanner;

public class calculator_using_a_switch {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double addition;
        double subtraction;
        double multiplication;
        double division;


        System.out.print("Enter Number 1 : ");
        num1 = scanner.nextDouble();

        System.out.print("Enter Number 2 : ");
        num2 = scanner.nextDouble();

        System.out.print("Select Operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                addition = num1 + num2;
                System.out.println("\nAddition : " + addition);
                break;
            case '-':
                subtraction = num1 - num2;
                System.out.println("Subtraction : " + subtraction);
                break;
            case '*':
                multiplication = num1 * num2;
                System.out.println("Multiplication : " + multiplication);
                break;
            case '/':
                division = num1 / num2;
                System.out.printf("Division : %.2f", division);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

        scanner.close();

    }
}
