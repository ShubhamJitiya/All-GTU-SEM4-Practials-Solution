package Assignments;

import java.util.Scanner;

interface InfaceX{
    void reverse();
}
class nationalized implements InfaceX {
    @Override
    public void reverse() {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println("Your Locker is Unlocked");
        else
            System.out.println("Please check your passphrase to unlock your locker");
    }
}

public class lockerNationalized {
    public static void main(String[] args) {

        nationalized locker1 = new nationalized();

    locker1.reverse();
    }
}
