package gamblingGame;

import java.util.Random;
import java.util.Scanner;

class Game {
	int playerGuess;
	int computerGuess;
	Random rand = new Random();  // random number generator
	Player player = new Player();

	public  String PlayGame(Player player){
			this.player= player;			// player object initialize
			playerGuess = playerGuess();	// player input 
			computerGuess = computerInput(playerGuess);  // computer value
			System.out.print("\nComputer number is  " + computerGuess);
			return determineWinner();   //  determines winner
			
	}
	
	

	private int playerGuess() {
		System.out.print("\nEnter Your Guessed Number ");
		Scanner inputScanner = new Scanner(System.in);
		int userInput;
			while (true) {	
				userInput = Integer.parseInt(inputScanner.nextLine());
			// checks invalid entry
			if(userInput>100 ||userInput<0 ) {
				
				System.out.print("Invalid entry");
			}
			
			else {
				break;
					}}
		
		System.out.print("Your guess is  "+ userInput);
		return userInput;
		
	}
			
			
	
	private int computerInput(int playerGuess) {
		int computerGuess;
		while (true) {	
			
			//Algorithm for 50% success,logically number by computer should be +-20 number by player 
			
			if(playerGuess>=20 && playerGuess<=100) {
			computerGuess = rand.nextInt((playerGuess+20)-(playerGuess-20))+(playerGuess-20);
			break;
			}
			
			else if(playerGuess<20 && playerGuess>0) {
			computerGuess = rand.nextInt((playerGuess+20))+1;
			break;
						}}
		return computerGuess;
		}

private String determineWinner() {
	if(Math.abs(playerGuess - computerGuess)<=10)
		return player.getPlayerName();   // returns player name 		
	else return "Computer";      //returns computer
}
}