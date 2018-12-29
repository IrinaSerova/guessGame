
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		// get ready to supply input data 
		Scanner scan = new Scanner(System.in);
		// play again variable
		String newGame = "";
		do {
		// create a random number from 1 - 100
		int randomNumber = (int)(Math.random()*100 + 1);
		int guess = 0;
		// start while loop for guessing
		while(guess != randomNumber) {
			System.out.println("Guess a number between 1 and 100: ");
			// get the user's number
			guess = scan.nextInt();
			
			// compare user's number to randomNumber
			
			if (guess < randomNumber)
				//ask player to play again
				System.out.println(" Your Number " + guess + " is too low. Please try again.");				
			else if(guess > randomNumber)
				//ask player to play again
				System.out.println(" Your Number " + guess + " is too high. Please try again.");
			else 
				// congratulations
				System.out.println(" Your Number " + guess + " is correct. Congratulations! You Won!");			
		} // end of while loop for comparing
		
		// ask for player to play again
		
		System.out.println("Would you like to play one more time (y/n)? ");
		newGame = scan.next();
	} while (newGame.equalsIgnoreCase("y")); 
		// thanks for game
		System.out.println("Thank you for playing!");
		

	}

}
