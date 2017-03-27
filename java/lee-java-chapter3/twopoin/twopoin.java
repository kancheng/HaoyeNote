/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class twopoin {
	public static void main(String argv[]) {
		System.out.println("Detail : 輸入兩組座標，求兩點間的距離");
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, k;
		System.out.println(" 輸入 x1 : ");
		x1 = input.nextDouble();
		System.out.println(" 輸入 y1 : ");
		y1 = input.nextDouble();
		System.out.println(" 輸入 x2 : ");
		x2 = input.nextDouble();
		System.out.println(" 輸入 y2 : ");
		y2 = input.nextDouble();
		k =  Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		System.out.println(" 距離 : " + Math.sqrt(k));
	}
}