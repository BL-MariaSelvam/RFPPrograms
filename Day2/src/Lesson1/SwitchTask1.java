package Lesson1;

import java.util.Scanner;

public class SwitchTask1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character to check vowel or Consonant");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
			System.out.println("Character is a vowel");
			break;
		case 'e':
			System.out.println("Character is a vowel");
			break;
		case 'i':
			System.out.println("Character is a vowel");
			break;
		case 'o':
			System.out.println("Character is a vowel");
			break;
		case 'u':
			System.out.println("Character is a vowel");
			break;
		default:
			System.out.println("Character is not a vowel");
			break;
		}
		
	}

}
