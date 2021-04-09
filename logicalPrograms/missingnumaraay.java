package logicalPrograms;

public class missingnumaraay {

	public static void main(String[] args) {
		int[] arr1= {1,2,4,5};
		int sum1=0;
		int sum2=0;
		//int[] arr2= {1,2,3,4,5};
		for(int i=0;i<=arr1.length-1;i++) {
			sum1=sum1+arr1[i];
		}
		for(int j = 0;j<=5;j++) {
			sum2=sum2+j;
		}
		System.out.print("Missing number is:"+(sum2-sum1));
	}
}
