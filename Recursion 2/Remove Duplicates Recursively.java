//Main Class
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}

//Solution Class
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)==s.charAt(1))
            return removeConsecutiveDuplicates(s.substring(1));
        else
            return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));

	}

}
