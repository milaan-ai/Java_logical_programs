package logicalPrograms;

public class oddEvenCount {

	public static void main(String[] args) {
		int num=12345689;
		
		int even=0;
		int odd=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				even++;
			}else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("Number of even num:"+even);
		System.out.println("Number of odd num:"+odd);
	}

}
