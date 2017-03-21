/* lhu java*/
import java.util.Scanner;
public class IntSwap{
	public static void main(String argv[]){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int t;
		/* output n & m value */
		System.out.println("Raw value : n = " + n + "; m = " + m);
		t = n;
		n = m;
		m = t;
		System.out.println("Exchange values : n = " + n + "; m = " + m);
	}
}