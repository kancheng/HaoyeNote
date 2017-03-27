/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class timemea {
	public static void main(String argv[]) {
		System.out.println("Detail : 輸入兩組有 時、分、秒 的時間，求兩者間的秒數");
		Scanner input = new Scanner(System.in);
		double t1, m1, s1, t2, m2, s2, k1, k2;
		System.out.println(" 第一組時間 : ");
		System.out.print(" 輸入 t1 : ");
		t1 = input.nextDouble();
		System.out.print(" 輸入 m1 : ");
		m1 = input.nextDouble();
		System.out.print(" 輸入 s1 : ");
		s1 = input.nextDouble();
		System.out.println(" 第二組時間 : ");
		System.out.print(" 輸入 t2 : ");
		t2 = input.nextDouble();
		System.out.print(" 輸入 m2 : ");
		m2 = input.nextDouble();
		System.out.print(" 輸入 s2 : ");
		s2 = input.nextDouble();
		System.out.println(" ");
		
		k1 =  (t1 * 60 * 60) + (m1 * 60) + s1;
		k2 =  (t2 * 60 * 60) + (m2 * 60) + s2;

		if( t1<= 23 && t2 <= 23 && m1<= 60 && m2<= 60 && s1 <= 60 && s2 <= 60){
			if(k1 > k2){
				System.out.println("差距秒數為 : " + (k1 - k2));
			} else if( k1 == k2) {
				System.out.println("相同時間無差距秒數");
			} else if(k1 < k2) {
				System.out.println("差距秒數為 : " + (k2 - k1));
			}

		} else {
			System.out.println("輸入的時間有誤");
		}
	}
}