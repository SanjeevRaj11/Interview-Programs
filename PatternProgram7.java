package interviewProgramsFundamentals;

public class PatternProgram7 {

	public static void main(String[] args) {
		
		/*
			    1       		*
		  	  2 1	              * *
		  	3 2 1		    * * *
		      4 3 2 1		  * * * *
		    5 4 3 2 1		* * * * *
		 */
		
		for(int row=1; row<=5; row++) {
			for(int col1=4; col1>=row; col1--) {
				System.out.print(" "+" ");
			}
			for(int col2=row; col2>=1; col2--) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}
		
		
	}
}
