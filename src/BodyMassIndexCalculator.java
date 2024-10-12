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

         */

    }
}


