//Practical: 4

//Calculate BMI
//BMI =    weight (kg)
//      ----------------
//      (height)^2 (meter)

//Input- Weight in pounds & Height in Inches.
// 1 pound=.45359237 Kg and 1 inch=.0254 meters.

package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;

class Conversion{
    static double KG = 0.45359237;
    static double M = 0.0254;
    double weightP, heightIn;

    public double power(double a){
        return a*a;
    }
    public void BMI(){
        double BMI;
        // BMI = weightP*KG/power((heightIn*M), 2);
        BMI = weightP*KG/power(heightIn*M);
//        System.out.println(BMI);
//        System.out.println("Weight in KG: " + weightP*KG);
//        System.out.println("Height in Meter: " + heightIn*M);
        if (BMI<18.5)
            System.out.println(BMI + "\nUnderweight");
        else if (BMI<25)
            System.out.println(BMI + "\nNormal");
        else if (BMI<30)
            System.out.println(BMI + "\nOverweight");
        else
            System.out.println(BMI+"\nObese");
    }
    }
public class P4_BMI {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 4");
        System.out.println("------------");
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
       DateTime();
        Scanner scan = new Scanner(System.in);

        Conversion person_A = new Conversion();

        //Read Weight in Pound
        System.out.print("Enter your Weight in Pound: ");
        person_A.weightP = scan.nextDouble();

        //Read Height in Inches
        System.out.print("Enter your Height Inches: ");
        person_A.heightIn = scan.nextDouble();

        //Get Result (BMI)
        System.out.print("Your Body Mass Index (BMI) : ");
        person_A.BMI();
    }
}
// 95 Pound = 43.09127515 KG
//9 Inch = 0.2286 meter
//Square of 0.2286 = 0.05225796
//bmi = weight (kg)/height^2 (meter)