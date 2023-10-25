package interviewProgramsFundamentals;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		
		int num = -5;
		
		if(num > 0) {
			System.out.println(num+" is Positive");
		}
		
		else if(num < 0) {
			System.out.println(num+" is Negative");
		}
		
		else if(num == 0) {
			System.out.println(num+" is neither Positive nor Negative");
		}
		
	}
	
}
