package week1.day1;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0  1 1  2  3  5  8  13  21  34  55
		
		int fn = 0;
		int sn = 1;
		int count =11;
		int result;
		
		System.out.print(fn+" "+sn);
				
		for(int i = 2; i<count; i++) {
			
			result = fn+sn;
			System.out.print(" "+result);
			fn = sn;
			sn = result;
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
