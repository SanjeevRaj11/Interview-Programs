package interviewProgramsFundamentals;

public class PrimeNumber_OrNot {

	//completed in time- 01:53:12
	
	
	public static void main(String[] args) {

//		A number that can be divided exactly only by itself and 1 is only considered as Prime Number,
//		for eg: 7, 17 and 41.	
		
	//Prime Number or Not
		
		
		int number = 3;//if number = 2, 2%2 == 0.
		boolean prime = true;
		
		for(int i=2; i<number; i++) {
			if(number%i ==0) { // 2%2 == 0 ??? so, is 2 considered as Not a Prime.
				prime=false;//means Not a Prime number
				break;//To reduce the comparison
			}
		}
		
		if(prime==false) {
			System.out.println("Not a Prime Number");
		}
		else if(prime==true)
		{
			System.out.println("Prime Number");
		}
		
		
		
		
		
		
		
		
		/*	int num= 14;
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0){ //only for 2 times it should get pass to check whether the entered number is Prime or Not.
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(num+" is a Prime Number");
		}
		
		else {
			System.out.println(num+" is NOT a Prime Number");
		}*/
		
		
	}

}
