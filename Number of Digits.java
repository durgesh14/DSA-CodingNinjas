//Main Class
import java.util.Scanner;

public class Runner {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.count(n));
	}
	
}
//Solution Class
public class Solution {

	public static int count(int n){
		//Write your code here
        if(n/10 == 0) {
			return 1;
		}
		
	
		int val = 1+count(n/10);
		return val;

}
    
}

//
