package Day5;

import java.util.Scanner;

public class HarmonicNumberTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get Harmonic Number");
		int num=sc.nextInt();
		double result=0;
		double i;
		if(num>0) {
			for(i=1;i<=num;i++) {
				result=result+(1.0/i);
			}
			System.out.println("The Hormonic Number is "+result);
		}
		else {
			System.out.println("Enter the positive number");
		}
	}

}
