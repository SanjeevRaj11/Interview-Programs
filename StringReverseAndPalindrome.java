package interviewProgramsFundamentals;

public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		System.out.println("---------Printing String in Reverse------------");
//Printing the String in Reverse: 
		String name = "ABCDE";
		System.out.println(name);
		System.out.println(name.length());//5
		          
				 //5-1=4
		for(int i=name.length()-1; i>=0; i--) {//reversing
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
//Reverse the String: 
		
		System.out.println("---------String Reversing and Storing------------");
		String str = "MOVA";//AVOM
		String mem = "";
		
		System.out.println(str);
		System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--) {//reversing
			
			mem += str.charAt(i);
		}
		
		System.out.println("mem = "+mem);
		
//Panlindrome String or Not  :
		
		System.out.println("--------String Palindrome or Not----------");
		
		String word = "LEVEL";
		String palindrome="";
		
		for(int i=word.length()-1; i>=0; i--) {//reversing
			palindrome += word.charAt(i);
		}
		
		if(word.equals(palindrome)) {
			System.out.println(palindrome+" is Palindrome");
		}
		else {
			System.out.println(palindrome+" is not a Palindrome");
		}
		
	}

}
