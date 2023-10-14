package interviewProgramsFundamentals;

public class GreatestNumberOf_2Numbers {
	
	public static void main(String[] args) {
		
		int a = 150;
		int b = 100;
		
		/* 3 possibilities while "comparing Two numbers":
		 		1. a > b
		 		2. a < b
		 		3. a == b
		 */
		
		if(a>b) {
			System.out.println("a is largest");
		}
		
		else if(a<b){
			System.out.println("b is largest");
		}
		
		else if(a==b) {
			System.out.println("a is equal to b");
		}
		
		
	}

}
