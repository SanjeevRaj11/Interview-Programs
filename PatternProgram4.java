package interviewProgramsFundamentals;

public class PatternProgram4 {

	/*
	  5
	  5 4 
	  5 4 3
	  5 4 3 2
	  5 4 3 2 1
	  
	 */
	public static void main(String[] args) {

		for(int row=5; row>=1; row--) {
			for(int col=5; col>=row; col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
