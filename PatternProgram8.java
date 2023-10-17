package interviewProgramsFundamentals;

public class PatternProgram8 {

	public static void main(String[] args) {
		
		//Complete time: 09:49:88
		
/*
			1       		*
		  2 1			  * *
		3 2 1			* * *
	  4 3 2 1		  * * * *
	5 4 3 2 1		* * * * *
	  4 3 2 1		  * * * * 
	    3 2 1           * * *
	      2 1             * *
	        1               *
*/
		
		for(int row=1; row<=5; row++) {
			
			for(int col1=5; col1>row; col1--) {
				System.out.print(" "+" ");
			}
			for(int col2=row; col2>=1; col2--) {
				System.out.print(col2+" ");
			}
			System.out.println();
			
		}
		
		for(int row2=4; row2>=1 ; row2--) {
			for(int col1=5; col1>row2 ; col1-- ) {
				System.out.print(" "+" ");
				}
			for(int col2=row2; col2>=1; col2--) {
				System.out.print(col2+" ");
			}
			System.out.println();
			
		}
		
	}
}
