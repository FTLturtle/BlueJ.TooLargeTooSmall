
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args){
        tooLargeTooSmall();
    }
    
    public static void tooLargeTooSmall()
    {
        Random rand = new Random();
        int target = rand.nextInt(10) + 1;
        System.out.print("A random number has been generated between 1 and 10 inclusive\nYou must guess this number\n");
        int guess;
        int guessCounter;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input guess: ");
        guess = scanner.nextInt();
        guessCounter = 1;
        
        while (guess != target){
            
            if (guess > target){
                System.out.print("Too high, guess again: ");
            }
            
            else if (guess < target){
                System.out.print("Too low, guess again: ");
            }
            
            guess = scanner.nextInt();
            guessCounter++;
        }
        
        System.out.print("Correct! It took you " + guessCounter + " guesses to get to the correct answer\n");
    }
}
