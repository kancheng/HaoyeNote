/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class anglemea {
	public static void main(String argv[]) {
		System.out.println("Detail : 三角形計算");
		Scanner input = new Scanner(System.in);
		double a, b, ang, k1, k2;
		System.out.print(" 輸入 a : ");
		a = input.nextDouble();
		System.out.print(" 輸入 b : ");
		b = input.nextDouble();
		System.out.print(" 輸入 angle : ");
		ang = input.nextDouble();
		System.out.println(" ");
		
		k1 =  (a * b * Math.sin(ang))/2;
		k2 =  Math.sqrt((a * a) + (b * b) - (2 * a * b) * Math.cos(ang));

		System.out.println("三角形面積 : " + k1);
		System.out.println("第三邊長 : " + k2);
	}
}