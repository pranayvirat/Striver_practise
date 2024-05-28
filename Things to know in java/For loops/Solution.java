
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);

		int inp = sc.nextInt();

		int res = 0;

		if(inp==1 || inp==2){
			res = 1;
			System.out.println(res);
			System.exit(0);
		}
		int curr = 1;
		int next = 1;

		for(int i=3;i<=inp;i++){
			int temp = curr;
			curr = next;
			next = temp + next;
		}
		System.out.println(next);

		
	}

}
