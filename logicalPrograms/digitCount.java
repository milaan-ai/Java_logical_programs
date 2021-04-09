package logicalPrograms;
public class digitCount {
	public static void main(String[] args) {
		int num=12;
		int count=0;
		while(num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.println(count);
	}
}
