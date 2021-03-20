package gamblingGame;

import java.util.Scanner;

public class Casino {
	String playerName;
	int playerAge;
	String userInput;
	Player player = new Player(); //player object declared 
	
	
		public Player playerDetails() {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter Name ");
		userInput = inputScanner.nextLine();  // scanner scans the input value
		player.setPlayerName(userInput);  //  sets player name 
		System.out.print("Name : " + userInput);
		
		while (true) {
			
			System.out.print("\nEnter age   ");
			userInput = inputScanner.nextLine();
			
			try {
				player.setPlayerAge(Integer.parseInt(userInput));  // player object sets player Age using setAge function
				System.out.print("Player age : " + userInput);
				System.out.print("\nGuess the number between 1 and 100");
				System.out.print("\nAnd I will Guess a game");
				System.out.print("\nIf you guess in 10 of my guess: then you will win else I win!");
			}
			
			catch(Exception e){
				
				System.out.print("Please Enter a valid age number");
			}
			return player; 		  // player object returned 
			
		}
		
		
		
		
	}
	

}
