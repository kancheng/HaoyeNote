/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class anglemea {
	public static void main(String argv[]) {
		System.out.println("Detail : �T���έp��");
		Scanner input = new Scanner(System.in);
		double a, b, ang, k1, k2;
		System.out.print(" ��J a : ");
		a = input.nextDouble();
		System.out.print(" ��J b : ");
		b = input.nextDouble();
		System.out.print(" ��J angle : ");
		ang = input.nextDouble();
		System.out.println(" ");
		
		k1 =  (a * b * Math.sin(ang))/2;
		k2 =  Math.sqrt((a * a) + (b * b) - (2 * a * b) * Math.cos(ang));

		System.out.println("�T���έ��n : " + k1);
		System.out.println("�ĤT��� : " + k2);
	}
}