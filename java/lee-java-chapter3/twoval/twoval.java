/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class twoval {
	public static void main(String argv[]) {
		System.out.println("Detail : 輸入 2 值 判斷 m 是否為 n 的倍數與二者大小比較。 ");
		Scanner input = new Scanner(System.in);
		System.out.println(" input m value : ");
		double m = input.nextDouble();
		System.out.println(" input n value : ");
		double n = input.nextDouble();

		if (m > n){
			if( m % n == 0 ){
				System.out.println( m + " 是 " + n + " 的倍數");				 
			} else {
				System.out.println(" m > n ， 但 " + m + " 不是 " + n + " 的倍數");
			}
		} else {
			System.out.println(" m < n ， 所以 " + m + " 不是 " + n + " 的倍數");
		}
		System.out.println( m + " > " + n + " = " + ( m > n ));
		System.out.println( m + " >= " + n + " = " + ( m >= n));
		System.out.println( m + " < " + n + " = " + ( m < n));
		System.out.println( m + " <= " + n + " = " + ( m <= n));
		System.out.println( m + " == " + n + " = " + ( m == n));
		System.out.println( m + " != " + n + " = " + ( m != n));

	}
}