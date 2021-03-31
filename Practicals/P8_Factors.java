//Practical 8
//Factors
package Practicals;

import java.util.Scanner;

class Factors {
    int div;
    int value;

    //Constructor with value 2
    public Factors() {
        this.div = 2;
    }

    //Setter sets value
    public void setValue(int value) {
        this.value = value;
    }

    public int getDiv() {
        return div;
    }

    public void Calculate() {
        while (value > 1) {
            if (value % div == 0) {
                System.out.print(getDiv() + ", ");
                value = value / div;
            } else {
                div++;
            }
        }
    }
}

public class P8_Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Integer value: ");
        Factors num_1 = new Factors();
        num_1.setValue(input.nextInt());
        num_1.Calculate();
     }
    }

