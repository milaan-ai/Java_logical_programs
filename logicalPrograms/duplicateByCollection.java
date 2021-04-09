package logicalPrograms;

import java.util.HashSet;
public class duplicateByCollection {

	public static void main(String[] args) {
		String[] a= {"india","aus","canada","sri","usa","india","india","aus"};
		
		HashSet<String> hm=new HashSet<String>();
		
		for(String l:a) {
			if(hm.add(l)==false) {
				System.out.println("Found duplicate element:"+l);
				
			}
			
		}
		
	}
}	
