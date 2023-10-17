package interviewProgramsFundamentals;

public class PatternProgram11 {
	
	//Complete Time: 04:34:92
	
	public static void main(String[] args) {
		

/*	Decoded Pyramid-Pattern         Pyramid Pattern:
 
 //No space "BETWEEN" #. 	
	1 2 3 4 5      				         1 2 3 4 5
	#1 2 3 4	             			  1 2 3 4
	##1 2 3 	              			   1 2 3
	###1 2                     				1 2
	####1		                			 1
*/		
		for(int row=5; row>=1; row--) {
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
