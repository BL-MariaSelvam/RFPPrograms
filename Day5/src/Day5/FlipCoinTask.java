package Day5;

import java.util.Scanner;

public class FlipCoinTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of flips of a coin");
		double noOfFlips=sc.nextDouble();
		double flips,percentOfTails,percentOfHeads;
		int tailCount=0,headsCount=0;
		if(noOfFlips>0) {
			for(int i=1;i<=noOfFlips;i++) {
				flips=Math.random();
				if(flips<0.5) {
					System.out.println("Its Tails");
					tailCount++;
				}
				else {
					System.out.println("Its Heads");
					headsCount++;
				}
			}
			System.out.println("TailCount"+tailCount);
			System.out.println("Heads count"+headsCount);
			percentOfTails=(tailCount/noOfFlips)*100;
			percentOfHeads=(headsCount/noOfFlips)*100;
			System.out.println("Percentage of Heads"+percentOfHeads);
			System.out.println("Percentage of Tails"+percentOfTails);
			if(percentOfTails>percentOfHeads) {
				System.out.println("Percentage Of Tails occured "+percentOfTails+"times. It is more than Percentage of heads");
			}
			else {
				System.out.println("Percentage Of Heads occured "+percentOfHeads+"times. It is less than Percentage of tails");
			}
		}
		

	}

}
