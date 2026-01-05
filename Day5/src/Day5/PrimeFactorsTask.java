package Day5;

import java.util.Scanner;

public class PrimeFactorsTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to get prime factors");
		int num1=sc.nextInt();
		System.out.println("List of Prime factors are:");

        for (int i = 2; i <= num1; i++) {
            while (num1 % i == 0) {
                System.out.println(i);
                num1 = num1 / i;
            }
        }


	}

}
