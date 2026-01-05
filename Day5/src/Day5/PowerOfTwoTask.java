package Day5;

import java.util.Scanner;

public class PowerOfTwoTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to be powered");
		int powerValue=sc.nextInt();
		for(int i=0;i<powerValue;i++) {
			int result=(int) Math.pow(2, i);
			System.out.println("2 to the power of "+i+" is "+result);
		} 	
	}

}
