package Lesson1;

import java.util.Scanner;

public class ForTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,sum=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of natural numbers of "+num+" are "+sum);
	}

}
