/*
       Write a test program that
       prompts the user to enter ten numbers - setter()
       invoke a method to reverse the numbers - reverse()
       display the numbers - getter()
 */

package Assignments.Assignment_1;

import java.util.Scanner;

class test{
//    private int arr[] = new int[3];
    private int []arr = new int[10];

    //Reading values
    public void setArr() {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            this.arr[i] = input.nextInt();
        }
    }

    //Reversing array
    public void swap()
    {
        for (int i = 0;i<arr.length/2;i++)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    //Printing in Reverse order
    public void printInReverse()
    {
        System.out.print("Elements in reverse order: ");
        for (int j : arr) {
            System.out.print(j + ",");
        }
    }
}
public class P2_Reverse {
    public static void main(String[] args) {
        System.out.print("Enter 10 Integers: ");
        test num = new test();
        num.setArr();
        num.swap();
        num.printInReverse();
    }
}
