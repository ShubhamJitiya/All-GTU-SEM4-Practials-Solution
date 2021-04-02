package Assignments.Assignment_2;
import java.util.Scanner;

class Account {
     String Account_Holder; //the person whose name is on a bank account
     int Account_Number;
     int Initial_Amount;
     int Current_Balance;

//    private String nameOfAccount; //bank account name" is the official name by which you are known on this bank account

    public Account()
    {
        Account_Holder = "Anonymous";
        Account_Number = 123456;
        Initial_Amount = 0;
    }

    public Account(String nameOfAccount) {
        Account_Holder = nameOfAccount;
//        Current_Balance = 0; //Current Balace is updating through deposit, withdraw method
            //User can't define current balance - It is calculated and updated as per deposit and withdraw
    }

    public void Deposit(int amount)
    {
        Current_Balance = Current_Balance + amount;
    }

    public void Withdraw(int amount)
    {
            if(Current_Balance<amount)
            {
                System.out.println("Your Balance is low");
            }
            else
                Current_Balance -= amount;
    }
    public int Get_Balance()
    {
        return Current_Balance;
    }
}

public class Q2_Bank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String AccountHolder = new String(input.nextLine());

        Account A1 = new Account(AccountHolder);

        System.out.println("Account Holder Name: "+A1.Account_Holder);
        System.out.println("Current Balance: " + A1.Get_Balance());

        System.out.print("Enter Amount to Deposit: ");
        int deposit = input.nextInt();
        A1.Deposit(deposit);
        System.out.println("Current Balance: " + A1.Get_Balance());

        System.out.print("Enter Amount to Withdraw: ");
        int WD = input.nextInt();
        A1.Withdraw(WD);
        System.out.println("Current Balance: " + A1.Get_Balance());

    }
}


