package Day5;

import java.util.Scanner;

public class LeapyearTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check Leap year");
		int year=sc.nextInt();
		int years=year;
		int count=0;
		while(year>0) {
			int rem=year%10;
			count++;
			year=year/10;
		}
		if(count==4) {
			if(((years%4)==0)&&((years%100)!=0)||((years%400)==0)) {
			System.out.println("Year "+years+ " is leap year");	
			}
			else {
				System.out.println("Year "+years+ " is not leap year");	
			}
		}
		else {
			System.out.println("Year "+years+ " should be four digits");	
		}

	}

}
