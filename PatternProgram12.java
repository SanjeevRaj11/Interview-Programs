package interviewProgramsFundamentals;

public class PatternProgram12 {

	//Complete Time: 11:53:32
	public static void main(String[] args) {
		
/*
  Decoded Pyramid-Pattern         Pyramid Pattern:
 //No space "BETWEEN" #.
 	####1_                     1
 	###1_2_					  1 2
 	##1_2_3_         	     1 2 3
 	#1_2_3_4_				1 2 3 4 
 	1_2_3_4_5_       	   1 2 3 4 5 
 	#1_2_3_4_        		1 2 3 4
 	##1_2_3_        		 1 2 3 
 	###1_2_          		  1 2 
 	####1_ 	        		   1
 */
		
		for(int row=1; row<=5; row++) {
			for(int col1=5; col1>row; col1--) {
				System.out.print(" ");
			}
			for(int col2=1; col2<=row; col2++) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}
		
		for(int row=4; row>=1; row--) {
			for(int col1=5; col1>row; col1--) {
				System.out.print(" ");
			}
			for(int col2=1; col2<=row; col2++) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}
		
	
	}
}
