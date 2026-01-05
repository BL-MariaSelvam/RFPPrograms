package Day5;

import java.util.Scanner;

public class VowelConsonantTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character to check vowel or Consonant");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		case 'i':
			System.out.println("It is a vowel");
			break;
		case 'o':
			System.out.println("It is a vowel");
			break;
		case 'u':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is consonant");
			}
	

	}

}
