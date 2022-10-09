//Main Class
import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.lastIndex(input, x));
	}
}

//Solution Class


public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
			return lindex(input,x,input.length-1);
	}

	private static int lindex(int[] input, int x, int last) {
		if(last == 0)
			return -1;
		if(input[last] == x) {
			return last;
		}
		int ans = lindex(input, x, last-1);
		
		return ans;
	}
	
}
