/*
    Write a program that illustrates interface inheritance
    Interface P is extended by P1 and P2.
    Interface P12 inherited from both p1 and p2.
    Each interface declares constant and one method.
    Class Q implements P12.
    Instantiate Q and invoke each of its method. Each method displays one of the constants.
*/

package Assignments.Assignment_2;

interface P
{
//     public static final int val = 4;
    int P = 0;

    void display_P();
}

interface p1 extends P{
    int p1 = 1;

    void display_p1();

}

interface p2 extends P{
    int p2 = 2;

    void display_p2();
}

interface P12 extends p1,p2{
   int p12 = 12;

   void display_p12();
}

class Q implements P12{

    @Override
    public void display_P() {
        System.out.println("Value of Interface P: " + P);
    }

    @Override
    public void display_p1() {
        System.out.println("Value of Interface p1: " + p1);
    }

    @Override
    public void display_p2() {
        System.out.println("Value of Interface p2: " + p2);
    }

    @Override
    public void display_p12() {
        System.out.println("Value of Interface p12: " + p12);
    }
}

public class Q4_P12 {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.display_P();
        obj.display_p1();
        obj.display_p2();
        obj.display_p12();
    }
}
//Variables of interface are static
//Variables of Interface are by default constants
//public

//Static: Shares common memory
//Final: Value can not be changed/immutable
