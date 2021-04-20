/*
   Write a program that displays a tic-tac-toe board.
  A cell may be X, O, or empty. What to display at each cell is randomly decided.
  The X and O are images in the files X.gif and O.gif.
 */
package Practicals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class ticTacToe {
    //    char[][] array = {
//            {' ', ' ', ' '},
//            {' ', ' ', ' '},
//            {' ', ' ', ' '},
//            {' ', ' ', ' '}
//    };
    char[][] array = new char[3][3];
    char userInput;
    char computerInput;
    int position;
    int randomPosition;
    Scanner input = new Scanner(System.in);

    ticTacToe() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';
            }
    }

    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " | ");
            }
            System.out.println(" ");
            System.out.println("-----------");
        }
    }

    void setUserInput() {

        System.out.print("Your turn (X) ");
        userInput = 'X';

        System.out.print("At position: ");
        position = input.nextInt();
        //First Row
        if (array[0][0] == ' ' && position == 1)
            array[0][0] = userInput;
        else if (array[0][1] == ' ' && position == 2)
            array[0][1] = userInput;
        else if (array[0][2] == ' ' && position == 3)
            array[0][2] = userInput;
            //Second Row
        else if (array[1][0] == ' ' && position == 4)
            array[1][0] = userInput;
        else if (array[1][1] == ' ' && position == 5)
            array[1][1] = userInput;
        else if (array[1][2] == ' ' && position == 6)
            array[1][2] = userInput;
            //Third Row
        else if (array[2][0] == ' ' && position == 7)
            array[2][0] = userInput;
        else if (array[2][1] == ' ' && position == 8)
            array[2][1] = userInput;
        else if (array[2][2] == ' ' && position == 9)
            array[2][2] = userInput;
        else {

            System.out.println("Select your position again!");
            setUserInput();
        }
    }

    void setComputerInput() {

        System.out.print("Computer's turn (O) At position: ");
        computerInput = 'O';

        randomPosition = (int) (1 + Math.random() * 9);
        System.out.println(randomPosition + " ");
        //First Row

//        if (array[0][0] == ' ' && randomPosition == 1)
//            array[0][0] = computerInput;
//        else if (array[0][1] == ' ' && randomPosition == 2)
//            array[0][1] = computerInput;
//        else if (array[0][2] == ' ' && randomPosition == 3)
//            array[0][2] = computerInput;
//            //Second Row
//        else if (array[1][0] == ' ' && randomPosition == 4)
//            array[1][0] = computerInput;
//        else if (array[1][2] == ' ' && randomPosition == 5)
//            array[1][1] = computerInput;
//        else if (array[1][2] == ' ' && randomPosition == 6)
//            array[1][2] = computerInput;
//            //Third Row
//        else if (array[2][0] == ' ' && randomPosition == 7)
//            array[2][0] = computerInput;
//        else if (array[2][1] == ' ' && randomPosition == 8)
//            array[2][1] = computerInput;
//        else if (array[2][2] == ' ' && randomPosition == 9)
//            array[2][2] = computerInput;
        switch (randomPosition) {
            case 1:
                if(array[0][0]!= ' ')
                array[0][0] = computerInput;
                break;
            case 2:
                if(array[0][1] != ' ')

                    array[0][1] = computerInput;

                break;
            case 3:                if(array[0][2]!= ' ')

                array[0][2] = computerInput;

                break;
            case 4:                if(array[1][0]!= ' ')

                array[1][0] = computerInput;

                break;
            case 5:                if(array[1][1]!= ' ')

                array[1][1] = computerInput;

                break;
            case 6:                if(array[1][2]!= ' ')

                array[1][2] = computerInput;

                break;
            case 7:                if(array[2][0]!= ' ')

                array[2][0] = computerInput;

                break;
            case 8:                if(array[2][1]!= ' ')

                array[2][1] = computerInput;

                break;
            case 9:                if(array[2][2]!= ' ')

                array[2][2] = computerInput;

                break;

        }


    }

    int status() {
        //#1 to #3 rows
        if (array[0][0] != ' ' && array[0][0] == array[0][1] && array[0][1] == array[0][2]) {
            if (array[0][0] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }

        //#2
        else if (array[1][0] != ' ' && array[1][0] == array[1][1] && array[1][1] == array[1][2]) {
            if (array[1][0] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[1][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }
        //#3
        else if (array[2][0] != ' ' && array[2][0] == array[2][1] && array[2][1] == array[2][2]) {
            if (array[2][0] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[2][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }
        //#4 - Column - 1
        else if (array[0][0] != ' ' && array[0][0] == array[1][0] && array[1][0] == array[2][0]) {
            if (array[0][0] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }

        //#4 - Column - 2
        else if (array[0][1] != ' ' && array[0][1] == array[1][1] && array[1][1] == array[2][1]) {
            if (array[0][1] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }
        //#5 - Column - 3
        else if (array[0][2] != ' ' && array[0][2] == array[1][2] && array[1][2] == array[2][2]) {
            if (array[0][2] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][2] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }
//#6 - Diagonal - 1
        else if (array[0][0] != ' ' && array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
            if (array[0][0] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][0] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }

//#6 - Diagonal - 2
        else if (array[0][2] != ' ' && array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
            if (array[0][2] == 'X') {
                System.out.println("Congo ..! \nYou won this game");
                return 1;
            } else if (array[0][2] == 'O') {
                System.out.println("Sorry ..! \nYou Loose this game");
                return 1;
            } else if (array[0][0] != ' ' && array[1][1] != ' ' && array[2][2] != ' ') {
                {
                    System.out.println("Game is Draw..\n Play Again !");
                    return 1;
                }
            }
        }

        return 0;
    }
};

public class P11_01 {
    static void DateTime(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Practical: 11 - Extended Version-1");
        System.out.println("Tik tac toe");
        System.out.println("En: 190130107043");
        System.out.println("----------------");
    }
    public static void main(String[] args) {
        //Prints Date, Time Practical Number
        DateTime();
        ticTacToe game1 = new ticTacToe();
        int status;
        do {

            game1.displayBoard();
            game1.setUserInput();
            status = game1.status();
            if (status == 1)
                break;
            game1.setComputerInput();
            status = game1.status();
            if (status == 1)
                break;
        } while (true);
//    game1.displayBoard();

    }
}
//Create matrix structure of of 3x3
//  initialize all empty
//userInput()
//      check empty position
//      generate random number = number of empty position
//computerInput()
//      check empty position
//      generate random number = number of empty position
//decision
//    if matches all 7 cases
//      .
//      .
//      print you win \n computer lose
//else
// print draw (empty position == 0)