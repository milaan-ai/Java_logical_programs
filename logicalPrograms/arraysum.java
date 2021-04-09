package logicalPrograms;

import java.util.Scanner;



public class arraysum {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
