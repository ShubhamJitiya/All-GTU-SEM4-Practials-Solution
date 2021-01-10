//Practical: 7
//OP- ABC1234

import java.text.SimpleDateFormat;
import java.util.Date;

public class P7_NumberPlate {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 7");
        System.out.println("------------");
    }
    public static void main(String[] args) {

        //Prints Date, Time Practical Number
        DateTime();

        char charA = (char)(65 + (int)(Math.random()*26));
        char charB = (char)(65 + (int)(Math.random()*26));
        char charC = (char)(65 + (int)(Math.random()*26));
        int num = (1000 + (int)(Math.random()*9000));

        System.out.print("Generated Number Plate: ");
        System.out.print(charA);
        System.out.print(charB);
        System.out.print(charC);
        System.out.print(num);
    }
}
