package interviewProgramsFundamentals;

public class FactorialOfNumber {

	public static void main(String[] args) {

		
		//Factorial of a number 
//		eg: factorial of 5! = 5*4*3*2*1 (or) 1*2*3*4*5 = 120.
		
		int num=1;	
		for(int i=5; i>=1; i--) {
			num *=i;
		}
		System.out.println(num+" is factorail of 5");
		
		
	}

}
