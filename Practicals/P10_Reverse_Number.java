package Practicals;

import java.util.Scanner;

class reverse
{
    int [] arr = new int[10];

    //Reading Values
    public void setArr() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
    }

    //Reversing array
    void swap()
    {
        for (int i = 0; i<(arr.length)/2;i++)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    //Printing reverse number
    void printInReverse(){
        System.out.println("Elements in reverse pr");
        for (int i = 0; i<arr.length;i++)
            System.out.print(arr[i]+", ");
    }
}
public class P10_Reverse_Number {

    public static void main(String[] args) {

        System.out.println("Enter 10 integers: ");
         reverse num = new reverse();
         num.setArr();
         num.swap(); //Method is invoked to reverse numbers
         num.printInReverse();
    }
}
