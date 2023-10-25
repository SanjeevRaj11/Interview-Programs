package interviewProgramsFundamentals;

public class PrimeNumbers_in_GivenRange {


		//	A number that can be divided exactly only by itself and 1 is only considered as Prime Number,
		//	for eg: 7, 17 and 41.	
		
	public static void main(String[] args) {
		
		//completed in time- 02:22:76
	
		//Prime Number or Not

		for(int num=25; num<=75; num++) {
			boolean prime= true;
			
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					prime=false;
					break;
				}
			}
			
			if(prime==true)
			{
				System.out.println(num+" is Prime Number");//29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73
			}
		}
		
		
		
		
	}
	
}
