/* lhu java*/
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class EvenOdd {
	public static void main(String argv[]) {

		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		int k = rnd.nextInt(100);
		System.out.println("產生 1 - 100 間的隨機整數並判斷奇數與偶數 : " );

		if( k % 2 == 0) {
			System.out.println( k + "is Even");
		} else {
			System.out.println( k + "is Odd");
		}

	}
}