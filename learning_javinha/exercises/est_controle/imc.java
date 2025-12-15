/* 
Write a program where the users enter their height and wheight, and calculates their
  BMI (Body mass index), (BMI= weight/(height *height)) and prints a message according to the result.

  if it is less than or equal to 18,5 "UnderWeight";
  if it is between 18.6 and 24.9 "ideal weight";
  if it is between 25.0 and 29.9 "Slightly overweight";
  if it is between 30.0 and 34.9 "Obesity Grade I";
  if it is between 35,0 and 39.9 "Obesity Grade II (Severe)";
  if it is greater than 40,0 "Obesity III (Morbid)";
 */
package learning_javinha.exercises.est_controle;
import java.util.Scanner;
public class imc {
    public static void main (String[] args){
        System.out.println(">>>>>>>Welcome to the BMI Calculator<<<<<<<");
        var scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        var name = scanner.nextLine();
        System.out.println ("Enter your height in meters (use a dot.) :");
        var height = scanner.nextDouble();
        System.out.println("Enter your weight in kilograms");
        var weight = scanner.nextDouble();


        System.out.printf("------Ok, %s, your information has been registered successfully-----\n", name);
        System.out.printf("Height = %s\nWeight = %s\n", height, weight);


        var bmi = weight/(height*height);

        System.out.printf ("\nYour BMI is:>>>> %.1f <<<<\n", bmi);
        System.out.printf ("\nBMI classification:");

        if (bmi <= 18.5){
            System.out.println(" Underweight!");
        }else if ((bmi >= 18.6) && (bmi <= 24.9)){
            System.out.println(" Normal weight");
        }else if ((bmi >= 25) && (bmi <= 29.9)){
            System.out.println(" Overweight");
        }else if ((bmi >= 30) && (bmi <= 34.9)){
            System.out.println(" Obesity Class I");
        }else if ((bmi >= 35) && (bmi <= 39.9)){
            System.out.println(" Obesity Class II");  
        }else {
            System.out.println(" Obesity Class III (Morbid obesity)");     
        }   
        scanner.close();
    }
}
