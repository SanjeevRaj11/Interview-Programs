package interviewProgramsFundamentals;

public class PrintAlphabets_UsingLoopAndRecursion {

	public static void main(String[] args) {
		
/*
//      Print alphabets using For-Loop:  
		for(char letter='A'; letter<='Z'; letter++) {
			
			System.out.print(letter+" ");
		}

*/
		
		char l='A';
		Alphabets(l);
		
	}
	
	public static void Alphabets(char l) {
		
		if(l <= 'Z') {
			System.out.print(l+" ");
			l++;
			Alphabets(l);
		}
		
	}
	
}
