package com.company;
import java.util.Scanner;

public class Main {

    //square cube method
    public static void SquareCube() {

        /**************************************************
         *Calls and uses scanner class with UserValidation*
         *************************************************/
        Scanner scan = new Scanner(System.in);
        boolean isNumber = true;
        boolean userChoice = true;
        int userNum;
        char userCont;



            while (userChoice) {
                System.out.println("Enter an integer:");
                userNum = scan.nextInt();
                /**************************
                 Math behind cube and square
                 **************************/
                System.out.printf("%-12s%-12s%s\n", "Number:", "Squared:", "Cubed:");
                System.out.printf("%-12s%-12s%s\n", "=======", "========", "======");
                for (int i = 1; i <= userNum; i++) {
                    int square = i * i;
                    int cube = i * i * i;
                    System.out.printf("%-12d%-12d%-7d\n", i, square, cube);
                }

                /**********************
                 * User continue loop *
                 **********************/
                System.out.println("Do you wish to continue? (y/n)");
                userCont = scan.next().charAt(0);
                if (userCont == 'n') {
                    break;
                }
        }
    }

    public static void main(String[] args) {
        //Calls SquareCube method
        SquareCube();
    }
}
