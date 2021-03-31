package Practicals;

import java.util.Scanner;

class pra11_2{
    int[][] arr = new int[3][3];
    String p1;
    String p2;
    static int count = 0;
    Scanner input = new Scanner(System.in);
    public void info(){
        System.out.println("\nPractical 11 - (Extension 2): Write a program that generate\n6*6 two-dimensional matrix, filled with 0's and 1's,\ndisplay the matrix, check every row and column\nhave an odd number's of 1's.\n\nExtension-2: Convert this practical in terms of \"Tic Tac Toe\".\n");
        System.out.println("Enrollment No: 190130107128");
        System.out.println("Date & Time: "+java.time.LocalDateTime.now());
        System.out.println("----------------------------------------------------------\n");
    }
    public void getPlayers(){
        System.out.print("Enter first player's name (Sign O) : ");
        p1 = input.nextLine();
        System.out.print("Enter second player's name: (Sign X) : ");
        p2 = input.nextLine();
    }
    public void init(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = -1;
            }
        }
    }
    public void displayArray(){
        int t=1;
        System.out.println();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j]==-1){
                    System.out.print("  " + t + "  ");
                }
                else if(arr[i][j]==0){
                    System.out.print("  O  ");
                }
                else{
                    System.out.print("  X  ");
                }
                if(j==0 || j==1){
                    System.out.print("|");
                }
                t++;
            }
            if(i!=2){
                System.out.print("\n --------------- \n");
            }
        }
        System.out.println("\n");
    }
    public boolean if0_1(int t){
        if(t==-1){
            return true;
        }
        return false;
    }
    public boolean isValid(int t){
        if(t<1 || t>9){
            return false;
        }
        switch(t){
            case 1:
                return if0_1(arr[0][0]);
            case 2:
                return if0_1(arr[0][1]);
            case 3:
                return if0_1(arr[0][2]);
            case 4:
                return if0_1(arr[1][0]);
            case 5:
                return if0_1(arr[1][1]);
            case 6:
                return if0_1(arr[1][2]);
            case 7:
                return if0_1(arr[2][0]);
            case 8:
                return if0_1(arr[2][1]);
            case 9:
                return if0_1(arr[2][2]);
        }
        return false;
    }
    public int getInput(){
        if(count%2==0){
            System.out.print(p1 + "'s turn. Enter the position to add (O): ");
        }
        else{
            System.out.print(p2 + "'s turn. Enter the position to add (X): ");
        }
        int t=0;
        while(true){
            t = input.nextInt();
            if(!isValid(t)){
                System.out.print("Enter valid position: ");
            }
            else{
                break;
            }
        }
        return t;
    }
    public void add(int t){
        int temp;
        if(count%2==0){
            temp = 0;
        }
        else{
            temp = 1;
        }
        switch(t){
            case 1:
                arr[0][0]=temp;
                break;
            case 2:
                arr[0][1]=temp;
                break;
            case 3:
                arr[0][2]=temp;
                break;
            case 4:
                arr[1][0]=temp;
                break;
            case 5:
                arr[1][1]=temp;
                break;
            case 6:
                arr[1][2]=temp;
                break;
            case 7:
                arr[2][0]=temp;
                break;
            case 8:
                arr[2][1]=temp;
                break;
            case 9:
                arr[2][2]=temp;
                break;
        }
    }
    public boolean check(int t){
        int r=0;
        int c=0;
        int d=0;
        int a=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(arr[i][j]==t){
                    r++;
                }
                if(arr[j][i]==t){
                    c++;
                }
            }
            if(arr[i][i]==t){
                d++;
            }
            if(r==3 || c==3 || d==3){
                return true;
            }
            r=0;
            c=0;
        }
        for(int i=2, j=0; i>=0 && j<3; i--,j++){
            if(arr[i][j]==t){
                a++;
            }
        }
        if(a==3){
            return true;
        }
        return false;
    }
    public void printResult(){
        displayArray();
        if(count==9){
            System.out.print("It's a tie.\n");
        }
        else{
            System.out.print("Congratulations! ");
            if(count%2==0){
                System.out.print(p1);
            }
            else{
                System.out.print(p2);
            }
            System.out.print(" has won the match.\n");
        }
    }
    public static void main(String[] args){
        int t;
        boolean checkvar;
        pra11_2 obj = new pra11_2();
        obj.info();
        obj.getPlayers();
        obj.init();
        while(count<9){
            obj.displayArray();
            t = obj.getInput();
            obj.add(t);
            if(count>3){
                if(count%2==0){
                    checkvar = obj.check(0);
                }
                else{
                    checkvar = obj.check(1);
                }
                if(checkvar){
                    break;
                }
            }
            count++;
        }
        obj.printResult();
    }
}