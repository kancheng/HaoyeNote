/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class thrpoin {
	public static void main(String argv[]) {
		System.out.println("Detail : 輸入兩組座標，求兩點間的距離");
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, k1, k2, k3, s,tri;
		System.out.print(" 輸入 x1 : ");
		x1 = input.nextDouble();
		System.out.print(" 輸入 y1 : ");
		y1 = input.nextDouble();
		System.out.print(" 輸入 x2 : ");
		x2 = input.nextDouble();
		System.out.print(" 輸入 y2 : ");
		y2 = input.nextDouble();
		System.out.print(" 輸入 x3 : ");
		x3 = input.nextDouble();
		System.out.print(" 輸入 y3 : ");
		y3 = input.nextDouble();
		System.out.println(" ");
		
		k1 =  Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		k2 =  Math.sqrt(((x1 - x3) * (x1 - x3)) + ((y1 - y3) * (y1 - y3)));
		k3 =  Math.sqrt(((x3 - x2) * (x3 - x2)) + ((y3 - y2) * (y3 - y2)));
		System.out.println("三邊距離各為 : " + " 1. " + k1 + ", 2. " + k2 + ", 3. " + k3);

		if( (k1+k2) > k3 && (k1+k3) > k2 && (k2+k3) > k1){
			System.out.println("三角形成立");
			s = ( k1 + k2 + k3 ) / 2;
			tri = Math.sqrt((s * ( s - k1 ) * ( s - k2 ) * ( s - k3 )));
			System.out.println("三角形面積 : " + tri);
		} else{
			System.out.println("三角形不成立");
		}

	}
}