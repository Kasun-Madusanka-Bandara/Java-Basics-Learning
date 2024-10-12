import java.util.Scanner;

public class if_statement {
    public static void main(String[]args){

        // if statement --> performs a block of code if it's condition evaluates to be true

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age>=18){
            System.out.println("Your are an Adult!");
        }
        else if(age < 18 & age> 0){
            System.out.println("Your are an child!");
        }
        else {
            System.out.println("Invalid age!");
        }

    }
}
