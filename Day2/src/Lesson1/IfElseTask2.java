package Lesson1;

import java.util.Scanner;

public class IfElseTask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number like 1,10,100,1000");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("The number is Unit");
		}
		else if(num==10) {
			System.out.println("The number is Ten");
		}
		else if(num==100) {
			System.out.println("The number is Hundred");
		}
		else if(num==1000) {
			System.out.println("The number is Thousands");
		}
		else {
			System.out.println("Other numbers");
		}
	}

}
