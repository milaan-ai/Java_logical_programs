package logicalPrograms;

public class palindromeString {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			if(rev.equalsIgnoreCase(str)) {
				System.out.println("This is a palindrome");
			}else {
				System.out.println("This is not a palindrome");
			}
			
		
	}
}
