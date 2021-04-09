package logicalPrograms;

public class swapnumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		
		int temp=a;//swap numbers using third v
		
		a=b;
		b=temp;
		
		System.out.println("a="+a+ "b="+b);
		
		
		a=a+b;//swapped numbers without using temp
		b=a-b;
		a=a-b;
		
		System.out.println("a:"+a+" "+"b:"+b);
		
		
		
		
		
	}

}
