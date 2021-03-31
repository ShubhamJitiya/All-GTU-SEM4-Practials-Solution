package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class P13{
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En: 190130107043");
        System.out.println("Practical: 13");
        System.out.println("------------");
    }
    static Scanner input = new Scanner(System.in);
    static String str;
    static int i = 0;
    static String operand1 = "";
    static String operand2 = "";
    static char operator;
    boolean checkOperator(){
        for(int t=0; t<str.length(); t++){
            if(isOperator(str.charAt(t))){
                return true;
            }
        }
        return false;
    }
    boolean isDigit(){
        if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            return true;
        }
        return false;
    }
    void clearSpace(){
        while(str.charAt(i) == ' '){
            i++;
        }
    }
    boolean isOperator(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
            return true;
        }
        return false;
    }
    void getOperand1(){
        while(!isOperator(str.charAt(i)) && i < str.length() && str.charAt(i)!=' ' && isDigit()){
            operand1 = operand1 + str.charAt(i);
            i++;
        }
    }
    void getOperand2(){
        while(i < str.length() && isDigit()){
            operand2 = operand2 + str.charAt(i);
            i++;
        }
    }
    void getOperator(){
        operator = str.charAt(i);
        i++;
    }
    boolean isValid(){
        while(i < str.length()){
            clearSpace();
            if(isDigit()){
                getOperand1();
                clearSpace();
                if(isOperator(str.charAt(i)) && !isOperator(str.charAt(i+1))){
                    getOperator();
                }
                else{
                    return false;
                }
                clearSpace();
                getOperand2();
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        //Prints Date, Time Practical Number
        DateTime();
        P13 obj = new P13();
        System.out.print("Enter the expression: ");
        str = input.nextLine();
        if(obj.checkOperator() && obj.isValid()){
            System.out.println("Operand1 = " + operand1);
            System.out.println("Operator = " + operator);
            System.out.println("Operand2 = " + operand2);
            System.out.println("The expression is valid.");
        }
        else{
            System.out.println("Invalid expression.");
        }
    }
}