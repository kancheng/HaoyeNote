/* lhu java*/
import java.util.Scanner;
import java.util.*;
public class EquRoot {
	public static void main(String argv[]) {

		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("一元二次方程式求根 \n 公式 : k = b * b - 4 * a * c > = 0");
		System.out.println(" a : ");
		a = input.nextInt();
		System.out.println(" b : ");
		b = input.nextInt();
		System.out.println(" c : ");
		c = input.nextInt();
		int k = b * b - 4 * a * c;

		double r1, r2;

		System.out.println(" a = " + a + "\tb = " + b + "\tc = " + c );

		if( k < 0) {
			System.out.println( "no real root" );
		} else if( k == 0) {
			r1 = (double) -b/(2*a);
			System.out.println("root : " + r1);
		} else {
			r1 = (-b + Math.sqrt(k))/(2 * a);
			r2 = (-b - Math.sqrt(k))/(2 *a);
			System.out.println( "root 1 : " + r1);
			System.out.println( "root 2 : " + r2);
		}

	}
}