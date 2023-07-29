import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        Random random=new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int score = 0;
        int round = 0;
        System.out.println("welcome to the guess the number game!");
        System.out.println("Guess the number between "+min+" and " +max +". Can you guess it?");

        boolean play = true;
        while(play)
        {
            round++;
            int numberGuess = random.nextInt(max-min+1)+min;
            int attempts = 0;
            while(attempts<maxAttempts)
            {
                System.out.print("enter the guess:");
                int userGuess = sc.nextInt();
                attempts++;
                if(userGuess == numberGuess)
                {
                    System.out.println("congratulations! you guessed the number in" + attempts + "attempts.");
                    score += maxAttempts - attempts+1;
                    break;
                }
                else if(userGuess < numberGuess){
                    System.out.println("to low! try a higher number");
                }
                else{
                    System.out.println("To high! try a lower number");
                }
            }
            if(attempts == maxAttempts)
            {
                System.out.println("Sorry, You have reached maximum attempt limit.");
            }
            System.out.println("do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            play = playAgainInput.equals("yes"); 
        }
        System.out.println("\n thanks for playing! your final ");
    }
}