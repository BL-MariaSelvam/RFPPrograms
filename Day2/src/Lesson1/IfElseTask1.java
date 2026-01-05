package Lesson1;

import java.util.Scanner;

public class IfElseTask1 {
	public static void main(String args[]) {
		int num,val,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		val=num;	
		while(val>0) {
			int n=val%10;
			count++;
			val=val/10;
		}
		if(count==1) {
		if(num==1) {
			System.out.println("ONE");
		}
		else if(num==2) {
			System.out.println("TWO");
		}
		else if(num==3) {
			System.out.println("THREE");
		}
		else if(num==4) {
			System.out.println("FOUR");
		}
		else if(num==5) {
			System.out.println("FIVE");
		}
		else if(num==6) {
			System.out.println("SIX");
		}
		else if(num==7) {
			System.out.println("SEVEN");
		}
		else if(num==8) {
			System.out.println("EIGHT");
		}
		else if(num==9) {
			System.out.println("NINE");
		}
		else {
			System.out.println("ZERO");
		}
		}
		else {
			System.out.println("Single digit is accepted");
		}
		
	}

}
