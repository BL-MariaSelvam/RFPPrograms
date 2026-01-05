package Lesson1;

import java.util.Scanner;

public class WhileTask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to reverse");
		int num=sc.nextInt();
		int temp=num;
		int reverse=0,n;
		while(num>0) {
			n=num%10;
			reverse=(reverse*10)+n;
			num=num/10;
		}
		System.out.println("The reverse of a given number "+temp+" is "+ reverse);

	}

}
