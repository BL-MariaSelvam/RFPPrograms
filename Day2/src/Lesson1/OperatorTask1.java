package Lesson1;

import java.util.Scanner;

public class OperatorTask1 {

	public static void main(String[] args) {
		System.out.println("Select which operation you want to do");
		System.out.println("1. a+b*c");
		System.out.println("2. c+a/b");
		System.out.println("3. a%b+c");
		System.out.println("4. a*b+c");
		System.out.println("5. Find Minimum");
		System.out.println("6. Find Maximum");
		
		int option,a,b,c,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation");
		option=sc.nextInt();
		System.out.println("Enter the number1");
		a=sc.nextInt();
		System.out.println("Enter the number2");
		b=sc.nextInt();
		System.out.println("Enter the number3");
		c=sc.nextInt();
		
		switch(option) {
		case 1:
			ans=a+b*c;
			System.out.println("The answer is "+ans);
			break;
		case 2:
			ans=c+a/b;
			System.out.println("The answer is "+ans);
			break;
		case 3:
			ans=a%b+c;
			System.out.println("The answer is "+ans);
			break;
		case 4:
			ans=a*b+c;
			System.out.println("The answer is "+ans);
			break;
			
		case 5:
			if((a>b) && (a>c)) {
				System.out.println("a is maximum");
			}
			else if(b>c) {
				System.out.println("b is maximum");
			}
			else {
				System.out.println("c is maximum");
			}
			break;
		case 6:
			if((a<b) && (a<c)) {
				System.out.println("a is minimum");
			}
			else if(b<c) {
				System.out.println("b is minimum");
			}
			else {
				System.out.println("c is minimum");
			}
			break;
			
		default:
			System.out.println("Not available");
			break;
		}

	}

}
