package Chapter5;

import java.util.Scanner;

/**
 * Write a rock, paper, scissors game.
 *
 * @author Gavin Wilkens
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerGuess;
        int playerGuess;
        int compCount = 0;
        int playerCount = 0;
        do {
            System.out.print(" Enter 0, 1 or 2 ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) //tie
                    {
                        if (computerGuess == 1) //lose
                        {
                            compCount++;
                        }
                    }
                    if (computerGuess == 2) //win
                    {
                        playerCount++;
                    }
                    break;
                case 1:
                    if (computerGuess == 1)//tie
                    {
                        if (computerGuess == 2)//lose
                        {
                            compCount++;
                        }
                    }
                    if (computerGuess == 0)//win
                    {
                        playerCount++;
                    }
                    break;
                case 2:
                    if (computerGuess == 2)//tie
                    {
                        if (computerGuess == 0)//lose
                        {
                            compCount++;
                        }
                    }
                    if (computerGuess == 1)//win
                    {
                        playerCount++;
                    }
                    break;

            }
        } while (playerCount <= 2 && compCount <= 2);
        if (playerCount > compCount) {
            System.out.println("You win!" + " Player score:" + playerCount + " Computer score:" + compCount);
        }
        if (playerCount < compCount) {
            System.out.println("You lose!" + " Player score:" + playerCount + " Computer score:" + compCount);
        }
        if (playerCount == compCount) {
            System.out.println("It's a tie!" + " Player score:" + playerCount + " Computer score:" + compCount);
        }
    }

}
