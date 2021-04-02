/*

    Write a program to implement an Abstract class Shape
    which contains Abstract method Area(). Create two other
    classes Circle and Square which overrides the method Area()
    and find the area of rectangle and square in respective classes.
    Write demo class

 */
package Assignments.Assignment_2;

import java.util.Scanner;

abstract class shape{
    public abstract void CalculateArea();
}

class circle extends shape {
    public double a;
    public circle(){
        this.a = 0;
    }
    public circle(double a){
        this.a = a;
    }
    public void CalculateArea(){

        System.out.println("Area of Circle: " + Math.PI * a * a);
    }
}

class square extends shape{
    public double a;
    public square(){
        this.a = 0;
    }

    public square(double a){
        this.a = a;
    }
    @Override
    public void CalculateArea(){

        System.out.println("Area of Square: " + a*a);
    }
}

class NegativeValueException extends Exception{
    @Override
    public String getMessage()
    {
        return "Can not be Negative";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Q5_Shape {
    public static void main(String[] args) throws NegativeValueException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius for Circle: ");
        double radius = input.nextInt();

        System.out.print("Enter side for Square: ");
        double side = input.nextInt();

        System.out.println(" ");

        try{
            if (radius < 0) {
                throw new NegativeValueException();
            }
            shape s1 = new circle(radius);
            s1.CalculateArea();
        }
        catch (NegativeValueException e)
        {
            System.out.println("Radius " + e.getMessage());
        }

        try{
            if (side < 0) {
                throw new NegativeValueException();
            }
            shape s2 = new square(side);
            s2.CalculateArea();
        }
        catch (NegativeValueException e)
        {
            System.out.println("Sides " + e.getMessage());
        }

    }
}
