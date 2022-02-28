import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1;
        int die2;
        int roll;
        int roll2;
        Boolean play = false;
        Boolean next = false;
        String playagain;
        String trash;

        System.out.println("Welcome to craps!");

        do {
            do {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                roll = die1 + die2;
                if (roll == 2) {
                    System.out.println("You rolled a " + roll + ", you crapped out. You loose!");
                } else if (roll == 3) {
                    System.out.println("You rolled a " + roll + ", you crapped out. You loose!");
                } else if (roll == 12) {
                    System.out.println("You rolled a " + roll + ", you crapped out. You loose!");
                } else if (roll == 7) {
                    System.out.println("You rolled a " + roll + ", you got a natural. You win!");
                } else if (roll == 11) {
                    System.out.println("You rolled a " + roll + ", you got a natural. You win!");
                } else {
                    System.out.println("You rolled a " + roll + ", the point is now " + roll);
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    roll2 = die1 + die2;
                    if (roll2 == 7) {
                        System.out.println("You rolled a " + roll2 + ", you loose!");
                        next = true;
                    } else if (roll2 == roll) {
                        System.out.println("You rolled a " + roll2 + ", you win!");
                        next = true;
                    } else {
                        System.out.println("Rerolling");
                    }

                }
            }
            while (!next);


            System.out.print("Would you like to play again? Y or N: ");
            playagain = in.nextLine();
            if (playagain.equalsIgnoreCase("y")) {
                System.out.println("Game restarting!");
                play = false;
                next = false;
            } else if (playagain.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing!");
                play = true;
            } else {
                trash = playagain;
                System.out.println("You entered: " + trash + ", Please enter [Y or N]");
                System.out.println();
            }


        }
        while (!play);


    }
}
