package Day4;

import java.util.Random;

public class Task2 {
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;

	public static void main(String[] args) {
		System.out.println("Snake and Ladder Game");
		int player1Position=0,player2Position=0,moves=0,currentPlayer=1,position=0;
		Random random=new Random();
		
		System.out.println("initial position of Player1: "+player1Position);
		System.out.println("initial position of Player2: "+player2Position);
		while(true) {
			
			int dieRolled=random.nextInt(6)+1;
			int option=random.nextInt(3);
			System.out.println("THe player"+currentPlayer+" is rolled the dice with "+dieRolled);
		if(currentPlayer==1) {
			 player1Position=playTurn(player1Position,dieRolled,option);
			System.out.println("Player1 position: "+player1Position);
			if(player1Position==100) {
				System.out.println("Player1 won the Game!!!");
				break;
			}
			if(option!=1) {
				currentPlayer=2;
				
			}
		}
		else {
			player2Position=playTurn(player2Position,dieRolled,option);
			System.out.println("Player2 position: "+player2Position);
			if(player2Position==100) {
				System.out.println("Player2 won the Game!!!");
				break;
			}
			if(option!=1) {
				currentPlayer=1;
				
			}
		}
		 moves++;
		}
System.out.println("Player uses moves of "+moves);
	}
	 private static int playTurn(int position, int dieRolled, int option) {

	        switch (option) {
	            case 1:
	                System.out.println("Ladder → Play again!");
	                if (position + dieRolled <= 100)
	                    position += dieRolled;
	                break;

	            case 2:
	                System.out.println("Snake → Go back");
	                position -= dieRolled;
	                if (position < 0)
	                    position = 0;
	                break;

	            default:
	                System.out.println("No Play → Stay same");
	        }
	        return position;
	    }
}
