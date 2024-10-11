import java.util.Scanner;

public class expression {
    public static void main(String[]args){

        // Expression = Operands and Operators
        // Operands = Values, Variables , Numbers , Quantity
        // Operators = + - * / %

        int value = 0;
        int price = 20 ;

        value = price + 10;
        System.out.println("price + 10 = "+value);

        value = price - 10;
        System.out.println("price - 10 = "+value);

        value = price * 2;
        System.out.println("price * 2 = "+value);

        value = price % 3;
        System.out.println("price % 3 = "+value);


        price++; // Increment one value
        System.out.println("price-- = "+price);

        price = 20;

        price--; // Discernment one value
        System.out.println("price-- = "+price);

        price = 20;

        value = price / 3;
        System.out.println("price / 3 = "+value);


        double gpa = 10 ;
        gpa = gpa / 3;   // (double) friends / 3
        System.out.println("gpa / 3 = "+gpa);

    }
}
