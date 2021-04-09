package logicalPrograms;

public class reverseString {

	public static void main(String[] args) {
		String str="ABCD";
		String rev1="";
		String rev2="";
		String rev3="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev1=rev1+str.charAt(i);
		}
		System.out.println("1st approach:"+rev1);
		
		
		char a[]=str.toCharArray();
		int size=a.length;
		for(int i=size-1;i>=0;i--) {
			rev2=rev2+a[i];
		}
		System.out.println("2nd Approach:"+rev2);
		
		StringBuffer sb= new StringBuffer(str);
		rev3=rev3+sb.reverse();
		System.out.println("3rd approach:"+rev3);
	}
}
