package interviewProgramsFundamentals;

public class Fibonacci_Series {

	public static void main(String[] args) {

		//write a program up to 10th number of Fibonacci Series program   
		
//print 0 1 1 2 3
//		f+s=t t 
//		  f	s	
		
		int f=0;
		int s=1;
		int t;
		
		for(int i=1; i<=20; i++) 
		{
			System.out.print(f+" ");
//			if(f==377) break;
			t=f+s;
			f=s;
			s=t;
		}
		
		
	}

}
