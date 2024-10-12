import java.util.Scanner;

public class hypotenuse_of_a_triangle {
    public static void main(String[]args){

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        a = scanner.nextDouble();

        System.out.print("Enter Side 2: ");
        b = scanner.nextDouble();

        // Calculate hypotenuse using the Pythagorean theorem
        c = Math.sqrt((a*a) +(b*b));
        System.out.println("Hypotenuse  = "+c);

        scanner.close();
    }
}
