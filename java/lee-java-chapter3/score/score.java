/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class score {
	public static void main(String argv[]) {
		System.out.println("Detail : �P�_��Ʀ��Z�B�d��b 0 ~ 100  ����");
		Scanner input = new Scanner(System.in);
		System.out.println(" input  value : ");
		double m = input.nextDouble();

		if (m >= 0 && m <= 100){
			System.out.println(" m �� " + m + " �b���`���Z�d��");
		} else {
			System.out.println(" m �� " + m + " �D���`���Z�d��");
		}
	}
}