import java.util.Scanner;

public class SimpleMathOperations {
    public static void main(String[]args){

        double num1;
        double num2;
        double addition;
        double subtraction;
        double multiplication;
        double division;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        num1 = scanner.nextDouble();

        System.out.print("Enter Number 2 : ");
        num2 = scanner.nextDouble();

        addition = num1 + num2;
        System.out.println("\nAddition : "+addition);

        subtraction = num1 - num2;
        System.out.println("Subtraction : "+ subtraction);

        multiplication = num1 * num2;
        System.out.println("Multiplication : "+multiplication);

        division = num1 / num2;
        System.out.printf("Division : %.2f",division);
        //System.out.println(String.format("Division: %.2f", division));

        scanner.close();

    }

}
