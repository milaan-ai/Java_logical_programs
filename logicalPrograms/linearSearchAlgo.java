package logicalPrograms;

import java.util.Scanner;

public class linearSearchAlgo {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search:");
		int search_ele=sc.nextInt();
		sc.close();
		
		for(int i=0;i<=a.length-1;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found "+i+" position.");
				break;
			}
		}
		System.out.println("Element not found");
	}
}
