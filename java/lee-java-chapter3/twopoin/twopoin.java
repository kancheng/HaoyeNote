/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class twopoin {
	public static void main(String argv[]) {
		System.out.println("Detail : ��J��ծy�СA�D���I�����Z��");
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, k;
		System.out.println(" ��J x1 : ");
		x1 = input.nextDouble();
		System.out.println(" ��J y1 : ");
		y1 = input.nextDouble();
		System.out.println(" ��J x2 : ");
		x2 = input.nextDouble();
		System.out.println(" ��J y2 : ");
		y2 = input.nextDouble();
		k =  Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
		System.out.println(" �Z�� : " + Math.sqrt(k));
	}
}