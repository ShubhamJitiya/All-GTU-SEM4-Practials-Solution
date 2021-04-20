/*
Practical 14:
Write a program that creates an Array List and adds a Loan object , a Date object ,
a string, and a Circle object to the list, and use a loop to display all elements in the
list by invoking the object’s toString() method.
*/

package Practicals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Loan
{
    int loanNo;
    String Name;

    Loan()
    {
        loanNo = 0;
        Name = "Enter_Your_Name";
    }

    Loan(int loanNo, String Name)
    {
        this.loanNo = loanNo;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNo=" + loanNo +
                ", Name='" + Name + '\'' +
                '}';
    }
}

class Circle
{
    String s;
    Circle()
    {
        s = "This is a Circle class";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class P14_ArrayList {

    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 14");
        System.out.println("------------");

    }
    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();
        //Collection Classes {ArrayList, Set, Map, hashmap, List, Vector, Etc

//        ArrayList al_obj = new ArrayList<Object>();

            ArrayList <Object> al_obj = new ArrayList <> ();
            Loan L1 = new Loan();
            Date D1 = new Date();
            String S1 = new String("My name is Shubham");
            Circle C1 = new Circle();

            al_obj.add(D1);
            al_obj.add(L1);
            al_obj.add(S1);
            al_obj.add(C1);

//            System.out.println();

            for (int i = 0; i<al_obj.size();i++) {
                System.out.println(al_obj.get(i));
            }
    }
}
