/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class timemea {
	public static void main(String argv[]) {
		System.out.println("Detail : ��J��զ� �ɡB���B�� ���ɶ��A�D��̶������");
		Scanner input = new Scanner(System.in);
		double t1, m1, s1, t2, m2, s2, k1, k2;
		System.out.println(" �Ĥ@�ծɶ� : ");
		System.out.print(" ��J t1 : ");
		t1 = input.nextDouble();
		System.out.print(" ��J m1 : ");
		m1 = input.nextDouble();
		System.out.print(" ��J s1 : ");
		s1 = input.nextDouble();
		System.out.println(" �ĤG�ծɶ� : ");
		System.out.print(" ��J t2 : ");
		t2 = input.nextDouble();
		System.out.print(" ��J m2 : ");
		m2 = input.nextDouble();
		System.out.print(" ��J s2 : ");
		s2 = input.nextDouble();
		System.out.println(" ");
		
		k1 =  (t1 * 60 * 60) + (m1 * 60) + s1;
		k2 =  (t2 * 60 * 60) + (m2 * 60) + s2;

		if( t1<= 23 && t2 <= 23 && m1<= 60 && m2<= 60 && s1 <= 60 && s2 <= 60){
			if(k1 > k2){
				System.out.println("�t�Z��Ƭ� : " + (k1 - k2));
			} else if( k1 == k2) {
				System.out.println("�ۦP�ɶ��L�t�Z���");
			} else if(k1 < k2) {
				System.out.println("�t�Z��Ƭ� : " + (k2 - k1));
			}

		} else {
			System.out.println("��J���ɶ����~");
		}
	}
}