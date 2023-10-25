package interviewProgramsFundamentals;

public class ReverseTheNumber {
	
	public static void main(String[] args) {
		
		int numb = 12345;
		int rem = 0;
		int reverse=0;
		System.out.println("Before reversing: "+numb);
		
		
		while (numb>=1) {//12345,1234,123,...1
			
		rem = numb%10;//5,4,3,...1
		reverse =  reverse*10 + rem;//0*10+5=5, 5*10+4=54, 54*10+3=543,.... 54321 
		
		numb= numb/10;//12345---> 1234,123,...1
		}
		
		System.out.println(reverse+" is a reversed number");
		
		
	}

}
