package logicalPrograms;
import java.util.Scanner;
public class palindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		int rev=0;
		int p=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==p) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
	}
}
