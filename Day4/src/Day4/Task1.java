package Day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static final int noPlay=0;
	public static final int ladder=1;
	public static final int snake=2;
	

	public static void main(String[] args) {
		System.out.println("Snake and Ladder Game");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of players");
		int noOfPlayers=sc.nextInt();
		int position=0,moves=0;
		Random random=new Random();
		
		System.out.println("initial position"+position);
		while(position<100) {
			
			int dieRolled=random.nextInt(6)+1;
			int option=random.nextInt(3);
			 switch (option) {
             case 1:
                 if (position + dieRolled <= 100) {
                     position += dieRolled;
                 }
                 System.out.println("Ladder → Move forward");
                 break;

             case 2:
                 position -= dieRolled;
                 if (position < 0) position = 0;
                 System.out.println("Snake → Move backward");
                 break;

             default:
                 System.out.println("No Play → Stay same");
         }

         moves++;
         System.out.println("Current Position: " + position);
         System.out.println("---------------------");
     }

     System.out.println("🎉 Player wins the game!");
     System.out.println("Total moves: " + moves);
	}

}
