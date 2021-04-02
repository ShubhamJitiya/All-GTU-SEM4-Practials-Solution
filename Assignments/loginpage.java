package Assignments;

import java.util.Scanner;

interface credential{
    void checkCredential(String username, String password);
}

//class login implements credential
//{
//    String Username;
//    String Password;
//
//    public login() {
//        Username = "shubh";
//        Password = "123";
//    }
//
//    @Override
//    public void checkCredential(String username, String password) {
//        if (username.equals(Username) && password.equals(Password)) {
//
//            System.out.println("You are Successfully logged in");
//        }
//        else if (username.equals(Username)) {
//            System.out.println("Invalid Password!");
//        } else if (password.equals(Password)) {
//            System.out.println("Invalid Username!");
//        } else {
//            System.out.println("Invalid user name and password !");
//        }
//    }
//}

class login {
    String Username;
    String Password;

    public login() {
        Username = "shubh";
        Password = "123";
    }
    public void checkCredential(String username, String password)
    {
        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("You are Successfully logged in");
        }
        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid user name and password !");
        }
    }
}


public class loginpage {
    public static void main(String[] args) {

        login page1 = new login();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = input2.next();

        page1.checkCredential(username, password);


    }
}

