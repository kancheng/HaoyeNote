/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class score {
	public static void main(String argv[]) {
		System.out.println("Detail : 判斷整數成績且範圍在 0 ~ 100  之間");
		Scanner input = new Scanner(System.in);
		System.out.println(" input  value : ");
		double m = input.nextDouble();

		if (m >= 0 && m <= 100){
			System.out.println(" m 為 " + m + " 在正常成績範圍內");
		} else {
			System.out.println(" m 為 " + m + " 非正常成績範圍內");
		}
	}
}