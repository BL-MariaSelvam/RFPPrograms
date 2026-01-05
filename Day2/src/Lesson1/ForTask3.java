package Lesson1;

import java.util.Scanner;

public class ForTask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,reverse=0,i,count=0,rem,temp,val;
		System.out.println("Enter the number to reverse");
		num=sc.nextInt();
		temp=num;
		val=num;
		while(val>0) {
			int n=val%10;
			count++;
			val=val/10;
		}
		
		for(i=1;i<=count;i++) {
			rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}
			
		if(temp==reverse) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not Palindrome");
		}

	}

}
