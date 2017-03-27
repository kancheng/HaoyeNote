/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class salary {
	public static void main(String argv[]) {
		System.out.println("Detail : 計算薪水 \n 1. 底薪 18000 \n 2. 獎金為銷售金額的百分之二");
		Scanner input = new Scanner(System.in);
		System.out.println(" 輸入銷售金額 : ");
		double m = input.nextDouble();
		double s, k;
		s = 18000;
		k = (( m / 100) * 2) + s;
		System.out.println("本月薪水 : " + k);
	}
}