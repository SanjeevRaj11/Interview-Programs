package interviewProgramsFundamentals;

public class CountingVowels {

	public static void main(String[] args) {
		
        	 //0123
		String word = "education";
             //1234
		int count = 0;

		for(int i=word.length()-1; i>=0; i--) {
	
	    char v = word.charAt(i) ; 
	
	    if( v=='a'|| v=='e'||v=='i'||v=='o'||v=='u') {
	    	count++;
	    }
	
		}

		System.out.println(count);

		
	}
}
