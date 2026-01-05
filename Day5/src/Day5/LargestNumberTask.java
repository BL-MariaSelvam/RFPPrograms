package Day5;

import java.util.Scanner;

public class LargestNumberTask {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers to check largest");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if((num1>num2)&&(num1>num3)) {
			System.out.println("The num1 is largest among three"+num1);
		}
		else if(num2>num3) {
			System.out.println("The num2 is largest among three"+num2);
		}
		else {
			System.out.println("The num3 is largest among three"+num3);
		}
	}

}
