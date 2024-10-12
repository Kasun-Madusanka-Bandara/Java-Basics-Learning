// Java program that calculates the Body Mass Index (BMI) of a person based on their height and weight

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double bmi; //Body Mass Index

        System.out.print("Enter your weight in kilograms : ");
        weight = scanner.nextDouble();

        System.out.print("Enter your height in meters : ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.printf("Your BMI is : %.2f ",bmi);
        //System.out.println(String.format("BMI : %.2f",bmi));

        /*
        categorize the BMI result
            Underweight: BMI < 18.5
            Normal weight: BMI between 18.5 and 24.9
            Overweight: BMI between 25 and 29.9
            Obese: BMI 30 and above



        if (bmi > 30){
            System.out.println("You are categorized as Obese ");
        }
        else if (29.9 >= bmi &&  bmi >= 25 ){
            System.out.println("You are categorized as Overweight ");
        }
        else if (24.9 >= bmi && bmi > 18.5){
            System.out.println("You are categorized as Normal weight ");
        }
        else if (bmi < 18.5){
            System.out.println("You are categorized as Underweight ");
        }
        else{
            System.out.println("Invalid!");
        }
        */
        System.out.println();

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

    }
}


