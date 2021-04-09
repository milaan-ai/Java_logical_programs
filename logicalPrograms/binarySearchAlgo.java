package logicalPrograms;

import java.util.Scanner;

public class binarySearchAlgo {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the searching number:");
		int key=sc.nextInt();
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		while(l<=h) {
			int m=(h+l)/2;
			if(a[m]==key) {
				System.out.println("Element is found");
				flag=true;
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("element not found");	
		}
	}
}
