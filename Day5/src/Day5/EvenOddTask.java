package Day5;

import java.util.Scanner;

public class EvenOddTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Even or Odd");
		int num1=sc.nextInt();
		if(num1%2==0) {
			System.out.println("The number "+num1+" is even");
		}
		else {
			System.out.println("The number "+num1+" is odd");
		}
	}

}
