//name = amanpreet kaur
//studentid = 201905375
//project name = Gambling Game

package gamblingGame;

import java.util.List;
import java.util.Scanner;


class gamblingGame {
	public static void main(String[] args) {
		String userInput;
				
		System.out.print("Do you want to play the game(y/n)   ");
		Scanner inputScanner = new Scanner(System.in);   // scanner object declared
		userInput = inputScanner.nextLine();
		
		 if(userInput.equals("y")) {
			System.out.print("lets Get started\n"
					+ "");
			
			Game game = new Game();   //game object declared 
			Casino casino = new Casino();   // casino object declared
			Player player = casino.playerDetails();	//player object  declared
			
			for(int i= 1; i<=5; i++) {
			System.out.print("\n"+ "Level " + i);
			String winnerOutput = game.PlayGame(player);	//player object passed 
			System.out.print("\n"+ winnerOutput+" is winner ");	}
				
		}
		 
		else
			
		{
			
			System.out.print("Good Bye");	
		}
			
			System.out.print("\nEnd of Game ");

	
	}
	
	}

