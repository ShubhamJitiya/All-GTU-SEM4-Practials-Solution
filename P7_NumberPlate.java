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

        String a = "";
        for(int i=0; i<3; i++){
             a = a + (char)((int)(Math.random()*( 'Z' - 'A' + 1)) + 'A');
        }
        for(int i=0; i<4; i++){
             a = a + (char)((int)(Math.random()*( '9' - '0' + 1)) + '0');
        }
        System.out.print("Plate Number Generated: "+a +"\n");
    }
}
