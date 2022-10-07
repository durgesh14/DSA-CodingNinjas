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
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
}

//Solution Class
public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
			return checkbetter(input, x, 0);

	}
	private static boolean checkbetter(int[] input, int x, int i) {
		if(input.length == i) {
			return false;
		}
		if(input[i] == x) {
			return true;
		}
		return  checkbetter(input, x, i+1);
		
	}
}

//Initial Commit
