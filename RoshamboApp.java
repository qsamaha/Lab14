

	import java.util.Scanner;
	public class RoshamboApp {
	    
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        //1. prompt user to enter name & opponent
	        //2. get user input
	        String name = Validator.getString(scan, "Enter name: ");
	        int opponent = Validator.getInt(scan, "Choose Opponent: (1 -Rock, 2 -Random): ");
	        
	        HumanPlayer player = new HumanPlayer(name);
	        
	        if (opponent == 1) {
	            RockPlayer RockPlayer = new RockPlayer();
	        }else if (opponent == 2) {
	            RandPlayer RandPlayer = new RandPlayer();
	        }
	        
	        //3. prompt user for choice R,P,S
	        
	        int userChoice = Validator.getInt(scan, "Select 1. rock, 2. paper, or 3. scissors: ");
	        Roshambo rosh;
	        if (userChoice == 1) {
	             rosh = Roshambo.ROCK;
	        }else if (userChoice == 2) {
	             rosh = Roshambo.PAPER;
	        }else if (userChoice == 3) {
	             rosh = Roshambo.SCISSORS;    
	        }
	        System.out.println("You chose " + userChoice);
	        
	        if (opponent == 1) {
	            if (rosh == RockPlayer.getRoshambo()) {
	                
	            }else if (rosh == )
	        }
	        
	        
	        //4. display results
	    }
	}
}
