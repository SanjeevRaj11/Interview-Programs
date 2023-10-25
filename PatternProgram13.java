package interviewProgramsFundamentals;

public class PatternProgram13 {

	public static void main(String[] args) {

/*
    Decoded Pyramid-Pattern         Pyramid Pattern:
 //No space "BETWEEN" #.
    1 2 3 4 5 					1 2 3 4 5
    #1 2 3 4		         		 1 2 3 4
    ##1 2 3					  1 2 3
    ###1 2					   1 2
    ####1  	 				    1
    ###1 2					   1 2
    ##1 2 3					  1 2 3
    #1 2 3 4					 1 2 3 4
    1 2 3 4 5	        		        1 2 3 4 5  
    
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
		
		for(int row=2; row<=5; row++) {
		
			for(int col1=5; col1>row ; col1-- ) {
				System.out.print(" ");
			}
			for(int col2=1; col2<=row; col2++) {
				System.out.print(col2+" ");
			}
			System.out.println();
		}

	}

}
