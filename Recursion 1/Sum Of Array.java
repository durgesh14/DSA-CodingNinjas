//Main Class

import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}

//Solution Class

public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return sumofarray(input,0);
		
	}
    
    	private static int sumofarray(int[] input, int i) {
		if(input.length == i) {
			return 0;
		}
		
		
		return input[i]+ sumofarray(input, i+1);
	
		 
	}
}
//Initial Commit
