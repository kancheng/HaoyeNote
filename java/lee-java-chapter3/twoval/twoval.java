/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class twoval {
	public static void main(String argv[]) {
		System.out.println("Detail : ��J 2 �� �P�_ m �O�_�� n �����ƻP�G�̤j�p����C ");
		Scanner input = new Scanner(System.in);
		System.out.println(" input m value : ");
		double m = input.nextDouble();
		System.out.println(" input n value : ");
		double n = input.nextDouble();

		if (m > n){
			if( m % n == 0 ){
				System.out.println( m + " �O " + n + " ������");				 
			} else {
				System.out.println(" m > n �A �� " + m + " ���O " + n + " ������");
			}
		} else {
			System.out.println(" m < n �A �ҥH " + m + " ���O " + n + " ������");
		}
		System.out.println( m + " > " + n + " = " + ( m > n ));
		System.out.println( m + " >= " + n + " = " + ( m >= n));
		System.out.println( m + " < " + n + " = " + ( m < n));
		System.out.println( m + " <= " + n + " = " + ( m <= n));
		System.out.println( m + " == " + n + " = " + ( m == n));
		System.out.println( m + " != " + n + " = " + ( m != n));

	}
}