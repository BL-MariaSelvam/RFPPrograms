package Lesson1;

import java.util.Scanner;

public class WhileTask1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
		sum=sum+num;
		num--;
		}
		System.out.println("The sum of natural numbers are: "+sum);
	}
	

}
