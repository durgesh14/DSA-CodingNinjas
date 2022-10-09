//Main Class
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}


//Solution Class

public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
        if(input.length() == 0) {
			return input;
		}
		String small = removeX(input.substring(1));
		
		if(input.charAt(0)=='x') {
			return ""+small;
		}
		else {
			return input.charAt(0) + small;
		}

	}
}
