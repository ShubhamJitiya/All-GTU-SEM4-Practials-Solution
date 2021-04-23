/*
    Write a Program in which
    the area of room is calculated and
    the cost of white wash is also evaluated.
    Further, include the provision for window on any type of the walls.
    The input regarding the parameters including length, breadth and height of the room are taken through command line. (constructor)
    If there is a window, then its parameter including length and breadth are also taken through command line. (two constructor)
    If these input parameters are below 1, then raise an exception; (check input - cover with try block)
    otherwise calculate the area and cost and display the result. (function - calc)
    (note that in order to calculate the area of the room to be painted the area of window must be deducted from the total of the room.)
 */
package Assignments.Assignment_3;

import java.util.Scanner;

class whiteWash
        {
            //room
            int l, b, h;
            static int COST = 15;

            //window
            int lw, bw;

            public whiteWash() {
                this.l = 0;
                this.b = 0;
                this.h = 0;
            }
            public whiteWash(int l, int b, int h) {
                this.l = l;
                this.b = b;
                this.h = h;
            }

            public whiteWash(int lw, int bw) {
                this.lw = lw;
                this.bw = bw;
            }

            public int areaOfWall()
            {
                return 2*(l*h+b*h);
            }
            int areaOfWindow()
            {
                return lw*bw;
            }
            public  int cost()
            {
                return COST*(areaOfWall() - areaOfWindow());
            }
        }
public class Rennovation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length, Breadth & height of Room");
        int l = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        System.out.println("If there is window in your room then enter its length and breadth - else enter 0, 0");
        int lw = scan.nextInt();
        int bw = scan.nextInt();
        try
        {
            if(l < 0 || b < 0 || h < 0 || lw < 0 || bw < 0)
                throw new Exception("Invalid");
            whiteWash room_1 = new whiteWash(l,b,h);
            System.out.println("Cost of white wash @15 Rs. is: " + room_1.cost());
        }
        catch (Exception e)
        {
            System.out.println("Data can not be negative");
        }
    }
}
