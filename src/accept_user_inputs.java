import java.util.Scanner;

public class accept_user_inputs {
    public static void main (String[]args){

    Scanner Scanner = new Scanner(System.in);

    System.out.print("What is your Name? ");
    String Name = Scanner.nextLine();

    System.out.print("How old are you? ");
    int Age = Scanner.nextInt();
    Scanner.nextLine();

    System.out.print("What is your favorite food? ");
    String Food = Scanner.nextLine();

    System.out.println("\nHello "+Name+"!");
    System.out.println("You are "+Age+" years old!");
    System.out.println("Your Favorite food is "+Food);


    }
}
