/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class mtPly {
	public static void main(String argv[]) {
		System.out.println("輸出數學式 : ");
		Scanner input = new Scanner(System.in);
		double a, b, c, k1, k2, k3, k4, cos, sin;
		System.out.println("a 值 : ");
		a = input.nextDouble();
		System.out.println("b 值 : ");
		b = input.nextDouble();
		System.out.println("c 值 : ");
		c = input.nextDouble();
		k1 = ( a + b ) * ( a + b ) * ( a + b );
		k2 = ( a * a ) + ( 2 * a * b ) + ( b * b );
		cos = Math.cos(a);
		sin = Math.sin(a);
		k3 = ( cos * cos) + (sin * sin);
		k4 = ((a * a) + (b * b) + ( c * c))/3;
		System.out.println( " 1 : ( a + b ) * ( a + b ) * ( a + b ) =  " + k1);
		System.out.println( " 2 : ( a * a ) + ( 2 * a * b ) + ( b * b ) =  " + k2);
		System.out.println( " 3 : (Math.cos(a) * Math.cos(a)) + (Math.sin(a) * Math.sin(a)) =  " + k3);
		System.out.println( " 4 : ((a * a) + (b * b) + ( c * c))/3 =  " + k4);
	}
}