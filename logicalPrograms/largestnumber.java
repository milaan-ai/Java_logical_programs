package logicalPrograms;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		
		System.out.print("Enter 2nd number:");
		int b= sc.nextInt();
		
		System.out.print("Enter 3rd number:");
		int c= sc.nextInt();
		sc.close();
		
		if(a>b && a>c ) {
			System.out.println(a+" is the largest");	
		}else if(b>a && b>c) {
			System.out.println(b+" is the largest");
		}else {
			System.out.println(c+" is the largest");
		}

	}

}
