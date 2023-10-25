package interviewProgramsFundamentals;

public class SpyNumber_OrNot {

	public static void main(String[] args) {
		//SpyNumber or Not: 
/*		
 	eg: 132   
 		---> 1+3+2= 6
 		---> 1*3*2= 6
  
    so, 132 is Spy Number.
 */
		int num = 132;
		int rem=0;
		int sum=0;
		int multi=1;
		
		while(num>=1) {
			rem = num%10;
			sum += rem;
			multi *= rem;
			num = num/10;
		}
		
		if(sum == multi) {
			System.out.println("It is a Spy Number");
		}
		else {
			System.out.println("Not a Spy Number");
		}
		
	}
}
