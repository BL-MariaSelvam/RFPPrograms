package Day5;

import java.util.Scanner;

public class SwapTwoNumberTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		
		System.out.println("After Swapping");
		System.out.println("Number1: "+num1);
		System.out.println("Number2: "+num2);
	}

}
