package guessing_game;

/**
 *
 * @author EfiMet
 */
import java.util.Scanner;

public class Guessing_Game {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String istatus = "p"; // p =play  istatus=inputstatus

        do {
            System.out.println("_____________________________________Welcome to the Game!_________________________________________");
            System.out.println("Enter 1 to play:\nEnter 2 to change the settings:\nEnter 3 to end: ");
            int scen = scan.nextInt();  // sen= scenario
            int PE = 7; //PE =PEasy
            int PH = 27;  // PH = PHard

            if (scen == 1) {
                //int pstatus = 1;//a=again  pstatus=playstatus

                System.out.println("                         Welcome to the Guessing Game!");
                System.out.println("Choose a level: \nFor Easy 1 or  For Hard 2: ");
                int lev = scan.nextInt();

                if (lev == 1) {
                    System.out.println("             Level_Easy: You have 3 tries!");
                    int A = 0;
                    int B = 20;
                    for (int i = 1; i < 4; i++) {
                        System.out.println("Try: " + i);
                        System.out.println("Guess an interger: ");
                        int g = scan.nextInt();
                        if (A < g && g <= B) {
                            if (g == PE) {
                                System.out.println("CORRECT\n");
                                break;
                            } else if (g < PE) {
                                System.out.println("TOO_SMALL\n");
                            } else {
                                System.out.println("TOO_BIG\n");
                            }
                        } else {
                            System.out.println("WRONG_ANSWER\n");
                        }
                    }

                } else if (lev == 2) {
                    System.out.println("          Level_Hard: You have 5 tries!");
                    int A = 0;
                    int B = 50;
                    for (int y = 1; y < 6; y++) {
                        System.out.println("Try: " + y );
                        System.out.println("Guess an interger: ");
                        int g = scan.nextInt();
                        if (A < g && g <= B) {
                            if (g == PH) {
                                System.out.println("CORRECT\n");
                                break;
                            } else if (g < PH) {
                                System.out.println("TOO_SMALL\n");
                            } else {
                                System.out.println("TOO_BIG\n");
                            }
                        } else {
                            System.out.println("WRONG_ANSWER\n");
                        }
                    }
                } else {
                    System.out.print("Wrong input!\n");
                }
                //System.out.print("To try again enter 1:\nTo finish enter 2: ");
                //pstatus = scan.nextInt();

                istatus = "p";

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                   
            } else if (scen == 2) {

                System.out.print("Welcome to the setting!\n\n");
                System.out.println("Enter a new number for the easy level: ");
                PE = scan.nextInt();
                System.out.println("The easy level number is " + PE + "!");
                System.out.println("Enter a new number for the hard level: ");
                PH = scan.nextInt();
                System.out.println("The hard level number is " + PH + "!");
                System.out.print("The settigs are done!\n\n");
                istatus = "p";

            } else if (scen==3){
                istatus = "e";
            }
            else{
                System.out.println("Wrong input!");
                istatus = "p";
            }

        } while (istatus == "p");

    }

}
