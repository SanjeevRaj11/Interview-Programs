package interviewProgramsFundamentals;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int num = 1234;
		int count=0;
		int digits=0;
		
		while(num>=1) { //1234,123, 
			num = num/10;//123,
			count++;//1
		}
		
		System.out.println(count+" digits");
		
		
	}
	}

