package logicalPrograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		
		//2nd approach
		StringBuilder s=new StringBuilder(String.valueOf(num));
		StringBuilder sb =s.reverse();
		System.out.println("Reverse number is:"+sb);
		
		
		//1st approach
		int rev=0;
		while(num!=0) {
			rev=rev*10+ num%10;
			num=num/10;
			
		}
		System.out.println("1st approach reverse num:"+rev);
		//sc.close();
	}
	
}
