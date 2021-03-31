//Practical: 7
//OP- ABC1234
package Practicals;

public class P7_Generate_NumberPlate {
    public static void main(String[] args) {

        char charA = (char)(65 + (int)(Math.random()*26));
        char charB = (char)(65 + (int)(Math.random()*26));
        char charC = (char)(65 + (int)(Math.random()*26));
        int num = (1000 + (int)(Math.random()*9000));

        System.out.print("Generated Number Plate: ");
        System.out.print(charA);
        System.out.print(charB);
        System.out.print(charC);
        System.out.print(num);

        /*
        //For 4-Digit Number

        //BELOW CODE ILLUSTRATES HOW RANDOM NUMBER GENERATES RANDOM
        //        WHICH IS UPPER BOUND AND WHICH IS LOWER BOUND
        for (int i=1;i<100;i++) {

//
            int y = 1000 + (int)(Math.random() * 9000);
            int y = 1000 + random.nextInt(9000);

//            int y = 1000 + (int)(Math.random() * 9000);
            //starting from 1000 and counts till 9999
            //GENERAL -> a + (int)(Math.random() * b)
            //         -> Gives number between a to a+b;
            //         -> Excluding Values a+b; Excluding 10000 (5-digit)
            System.out.println(y);
        }
        */

        /*
        //For alphabets from A to Z

        for (int i=1;i<100;i++) {

            //Both statement gives same output with same meaning
            int y = 65 + random.nextInt(26);
            int y = 65 + (int)(Math.random() * 26);

            //GENERAL -> a + (int)(Math.random() * b)
            //         -> Gives number between a to a+b;
            //         -> Excluding Values a+b; excluding 91 which is [
            char ch = (char) y;
            System.out.println(ch);
        }

         */
    }
}
