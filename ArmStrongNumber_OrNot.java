package interviewProgramsFundamentals;

public class ArmStrongNumber_OrNot {

	//Reverse, Palindrome, ArmStrong are all slight similar in programming and logically slight difference between them .

//	From 1 t0 1000 ArmStrong numbers are 0, 1, 153, 370, 371 and 407. Other numbers are not ArmStrong.
	
/*		ArmStrong calculation/finding : 153 --> each number multiplied with themselves for no. of digits
			
			ArmStrong ---> 153 = (1*1*1) + (5*5*5) + (3*3*3) = 1+125+27 = 153==153. 
		NotAsrmStrong ---> 92 = (9*9) + (2*2) =  85!=92.

*/
	public static void main(String[] args) {

		//ArmStrong Number or Not:
		int num = 371;//
		int copyOf_num = num;
		
		int rem=0;
		int total=0;
		
		while(num>=1) {
			rem= num%10;//3
			total += rem*rem*rem;//27,
			num = num/10;//153---> 15,
		}
		
		if(total == copyOf_num) {
			System.out.println(copyOf_num+" is a ArmStrong Number");
		}
		
		else {
			System.out.println(copyOf_num+" Not a ArmStrong Number");
		}
		
	}
}
