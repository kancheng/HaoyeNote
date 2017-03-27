/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class twoval {
	public static void main(String argv[]) {
		System.out.println("Detail : 块 2  耞 m 琌 n 计籔ゑ耕 ");
		Scanner input = new Scanner(System.in);
		System.out.println(" input m value : ");
		double m = input.nextDouble();
		System.out.println(" input n value : ");
		double n = input.nextDouble();

		if (m > n){
			if( m % n == 0 ){
				System.out.println( m + " 琌 " + n + " 计");				 
			} else {
				System.out.println(" m > n   " + m + " ぃ琌 " + n + " 计");
			}
		} else {
			System.out.println(" m < n  ┮ " + m + " ぃ琌 " + n + " 计");
		}
		System.out.println( m + " > " + n + " = " + ( m > n ));
		System.out.println( m + " >= " + n + " = " + ( m >= n));
		System.out.println( m + " < " + n + " = " + ( m < n));
		System.out.println( m + " <= " + n + " = " + ( m <= n));
		System.out.println( m + " == " + n + " = " + ( m == n));
		System.out.println( m + " != " + n + " = " + ( m != n));

	}
}