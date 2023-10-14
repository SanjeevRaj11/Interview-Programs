package interviewProgramsFundamentals;

import java.util.Scanner;

public class GreatestAmong_N_numbers {

	public static void main(String[] args) {

		
		int inMind =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Enter number"+i );
			int numb = sc.nextInt();
			
			if(numb>inMind) {
				inMind = numb;
			}
		}
		
		System.out.println("largest among n Numbers is: "+inMind);
		
		
	}

}
