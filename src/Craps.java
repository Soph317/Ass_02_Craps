import java.util.Random;
import java.util.Scanner;


public class Craps {
    public static void main(String[] args) {
        int die1;
        int die2;
        int crapsRoll;
        String playAgain = "yes";
        int point;
        boolean valid;

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        while (playAgain.equalsIgnoreCase("yes")) {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die2 + die1;

            System.out.println("First Roll:" + die1);
            System.out.println("Second Roll:" + die2);
            System.out.println("Sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You have crapped out, you lose!");
                System.out.println();
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You won with a natural win!");
                System.out.println();
            }
            else {
                System.out.println("Try for point!");
                System.out.println();
                point = crapsRoll;
                valid = false;

                while (!valid) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die2 + die1;

                    System.out.println("First Roll:" + die1);
                    System.out.println("Second Roll:" + die2);
                    System.out.println("Sum: " + crapsRoll);

                    if (crapsRoll == point) {
                        System.out.println("You made point, you win!");
                        System.out.println();
                        valid = true;
                    }
                    else if (crapsRoll == 7) {
                        System.out.println("You made 7 before making your point, you lose!");
                        System.out.println();
                        valid = true;
                    }
                    else {
                        System.out.println("Keep trying for point!");
                        System.out.println();
                    }
                }
            }
            System.out.println("Would you like to play again yes/no");
            playAgain = in.nextLine();
            System.out.println();
        }
    }
}
