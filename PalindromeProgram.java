package interviewProgramsFundamentals;

public class PalindromeProgram {

	
	public static void main(String[] args) {
		
		 int n = 12345;
		 int copy_of_n = n;
		 int rem =0;
		 int reverse = 0;
		
		 System.out.println("Before reversing: "+copy_of_n);
		 while(n>=1) {
		 
	     rem = n%10; //1
		 reverse = reverse*10 +rem;//0*10+1=1;
		 n = n/10;//54321---> 5432
		 
		 }
		 
		 System.out.println("After reversing: "+reverse);
		 System.out.println();
		 
		 if(reverse == copy_of_n) {
			 System.out.println(reverse+" is Palindrome");
		 }
		 else if (reverse != copy_of_n){
			 System.out.println(reverse+" is Not a Palindrome");
		 }
		 
		 
	
	}
	
}
