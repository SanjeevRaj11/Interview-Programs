package interviewProgramsFundamentals;

public class SumOfDigits {

	public static void main(String[] args) {
		
		//Sum Of Digits: addition of each number between them.
//		eg: 135 ---> 1+3+5=9.
		
		int num = 137;//11
		int rem =0;
		int total=0;
		
		while(num>=1) {
			rem = num%10;
			total += rem;
			num= num/10;
		}
		System.out.println(total);
		
	}
}
