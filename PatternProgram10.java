package interviewProgramsFundamentals;

public class PatternProgram10 {

	public static void main(String[] args) {

/* Decoded Pyramid-Pattern         Pyramid Pattern:
 //No space "BETWEEN" #.
		####1_				    1
		###1_2_             	       	   1 2 
		##1_2_3_   			  1 2 3
		#1_2 3_4_                	 1 2 3 4
		1_2_3_4_5_              	1 2 3 4 5

*/		
		
		for(int row=1; row<=5; row++) {
			
			for(int col=5; col>row; col--) {
				System.out.print(" ");
			}
			
			for(int col2=1; col2<=row; col2++) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}
		
	}
}
