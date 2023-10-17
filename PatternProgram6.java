package interviewProgramsFundamentals;

public class PatternProgram6 {
	
	/*
	 1 2 3 4 5           1 2 3 4 5     	  * * * * *
	   2 3 4 5 			 # 2 3 4 5		 	* * * *
	     3 4 5			 # # 3 4 5		   	  * * *
	  	   4 5			 # # # 4 5			 	* *
	         5			 # # # # 5			   	  *
	 */
	
	public static void main(String[] args) {
	
		
		//Number Pattern:
		for(int row=1; row<=5; row++) {
			
			for(int col1=1; col1<row; col1++) {
				System.out.print(" "+" ");
			}
			
			for(int col2=row; col2<=5; col2++) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}
		
		
/*		//Star Pattern:
		for(int row=5; row>=1; row--) {
			
			for(int col1=5; col1>row; col1--) {
				System.out.print(" "+" ");
			}
			
			for(int col2=1; col2<=row; col2++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
*/
		
	}

}
