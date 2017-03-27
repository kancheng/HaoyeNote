/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class AddvPlay {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		System.out.println(" 初始值 n = 0 \n Detail : 證明 n++ 與 ++n 之間的計算差異 。");
		int n1 = 0;
		int n2 = 0;
		n1 = n1++ + ++n1;
		System.out.println(" n++ + ++n : " + n1);
		n2 = ++n2 + n2++;
		System.out.println(" ++n + n++ : " + n2);
	}
}
