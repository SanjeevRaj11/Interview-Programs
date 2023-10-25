package interviewProgramsFundamentals;

public class PerfectNumber_OrNot {
	
	public static void main(String[] args) {
		

		//Perfect Number is Sum of its Divisors is equal to it.
//		eg. 28/1, 28/2, 28/4, 28/7, 28/14  --> Sum of Divisors : 1+2+4+7+14 = 28.♦☺
		
		//Perfect Number ----> Sum(addition) of Divisors = Given Number;
		
		
		int GivenNo = 28;
		int PerfectCheck=0;
		
		                  //28/2=14 --->Very Important
		for(int i=1; i <= (GivenNo/2); i++) {
			
			if(GivenNo%i == 0) {	
				PerfectCheck += i;//0+1+2+4+...+14 = 28 = Perfect	
			}
		}
		
		if(PerfectCheck == GivenNo) {
			System.out.println(GivenNo+" is Perfect Number");
		}
		
		else {
			System.out.println(GivenNo+" is Not a Perfect Number");
		}
		
	}

}
