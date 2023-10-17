package interviewProgramsFundamentals;

public class PatternProgram5 {
	/*
	  Number Pattern:        Star Pattern:
	
   	   5 4 3 2 1               * * * * *
	   5 4 3 2		   * * * *
	   5 4 3  		   * * *
	   5 4			   * *
	   5			   *
	   5 4			   * *
	   5 4 3 		   * * *
	   5 4 3 2		   * * * *
	   5 4 3 2 1		   * * * * *
	 */
	public static void main(String[] args) {

     //Number Pattern 		
		for(int row=1; row<=5; row++) {
			for(int col=5; col>=row; col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		for(int row2=4; row2>=1; row2--) {
			for(int col=5; col>=row2; col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}


/*      //Star Pattern		
		for(int row=5; row>=1; row--) {
			for(int col=1; col<=row; col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int row2=2; row2<=5; row2++) {
			for(int col=1; col<=row2; col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
*/
		
		
	}
}
