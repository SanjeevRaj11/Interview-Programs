package interviewProgramsFundamentals;

public class GreatestNumberAmong_3Numbers {

	/*Possibilities while Comparing 3 numbers: a,b,c
	 	a>b
	 	a>c
	 	
	 	b>a
	 	b>c
	 	
	 	c>a
	 	c>b
	 	
	 	a==b
	 	a==c
	 	b==c
	  	.
	  	.
	  	.
	  	.
	  	(WORKOUT and Find it for better Clarity on Possibilities)
	 
	 */
	
	public static void main(String[] args) {
	
		int a=30;
		int b=300;
		int c=100;
		
		if(a>b) {
			
			if(a>c) {
				System.out.println("a is largest");
			}
			else if(c>a) {
				System.out.println("c is largest");
			}
			else if(c == a) {
				System.out.println("a and c are equal");
			}
			
		}
		
		else if(b>a) {
			
			if(b>c) {
				System.out.println("b is largest");
			}
			else if(c>b) {
				System.out.println("c is largest");
			}
			else if(b==c) {
				System.out.println("b and c are equal");
			}
			
		}
		
		else if(a==b) {
			if((a&b)>c) {
				System.out.println("a and b are equal");
			}
			else if(c>(a&b)) {
				System.out.println("c is largest");
			}
			else if((a&b)==c) {
				System.out.println("a,b and c are equal");
			}
		}
		
	}
	
}
