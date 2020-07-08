/* 
 --------------------------------------------------------
  Assignment 1
  Written by: Lucas Catchlove id: 27145640
  For COMP 248 Section EE – Fall 2016

  ~GuessingGame 1.0~
   
   This program generates a random number between 0 and 
   100, and gives the user 5 tries to provide the 
   correct guess. 
  
 --------------------------------------------------------
 */

/* Import statements allow the programmer to make
 use of classes that arent included in the standard packages (i.e. java.lang) */

import java.util.Random; 
import java.util.Scanner; 

//

public class GuessingGame { // Begins the class definition block for the "GuessingGame" application.

	public static void main(String[] args) {  // Begins the definition of the main method.

		System.out.println("------------------------------\n" + "      Guessing Game v1.0\n" 		// welcome message :) 
															  + "------------------------------");




		// Initalizing and declaring variables. 

		Random rand = new Random();
		int RandomNumber = rand.nextInt(100); // Returns a random integer between 0 and 100 for the user to guess.
		int NumberofTries = 5;
		int guess;
		boolean loop = true;
		Scanner input = new Scanner(System.in); // The scanner class allows the program to receive keyboard input from the user.
		





/* The function of the while loop allows for the program to terminate and display the
proper output depending on wether the user has guessing the correct number or if
the user is out of tries. */ 
		
		while (loop == true) {

			
			System.out.print("Pick a number between 0 and 100: ");
				guess = input.nextInt(); 
				NumberofTries--; // This incrementally decreases the number of tries the user has.

			if (guess == RandomNumber) {
					System.out.println("you win! " + guess + " is the correct guess!");
					loop = false; // This kills the loop allowing the game to end and display the corresponding output.
			}

			else if (NumberofTries == 0) {
				System.out.println("You're out of tries! You loose! The correct guess was " + RandomNumber + ".");
				loop = false; 
			}

			else if (guess < RandomNumber) {
				System.out.println(guess + " is too low! Try again! You have " + NumberofTries + " guess(es) left.");							
			}

			else if (guess > RandomNumber) {
					System.out.println(guess + " is too high! Try again! You have " + NumberofTries + " guess(es) left.");
			}

				
		}



	System.out.println("Thanks for playing Guessing Game v1.0!\n"); // Prints a farewell message.


	}


}  