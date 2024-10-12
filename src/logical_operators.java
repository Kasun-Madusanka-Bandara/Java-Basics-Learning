import java.util.Scanner;

public class logical_operators {
    public static void main(String[]args){

        /*
        Logical operators --> Used to connect two or more expression
                && = (AND) both condition must be ture
                || = (or) either condition must be ture
                !  = (not) reverses boolean value of a condition
        */

        Scanner scanner = new Scanner(System.in);

        int temp;
        System.out.print("Enter temp: ");
        temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It is hot outside!");
        }
        else if (temp >= 20 && temp <=30) {
            System.out.println("It is warm outside!");
        }
        else {
            System.out.println("It is cold outside!");
        }

        System.out.print("Press Q or q : ");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You pressed Q or q");
        } else {
            System.out.println("You did not press Q or q");
        }

    }
}
