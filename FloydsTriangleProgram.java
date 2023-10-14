package interviewProgramsFundamentals;

public class FloydsTriangleProgram {

	/*
	   1
	   2 3
	   4 5 6
	   7 8 9 10
	   11 12 13 14 15
	 */
	
	public static void main(String[] args) {
		
		//Floyd's Triangle: 
		int n=1;
		
		for(int row=1; row<=4; row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		
		}
		
	}
}
