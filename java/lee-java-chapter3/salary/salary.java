/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class salary {
	public static void main(String argv[]) {
		System.out.println("Detail : �p���~�� \n 1. ���~ 18000 \n 2. �������P����B���ʤ����G");
		Scanner input = new Scanner(System.in);
		System.out.println(" ��J�P����B : ");
		double m = input.nextDouble();
		double s, k;
		s = 18000;
		k = (( m / 100) * 2) + s;
		System.out.println("�����~�� : " + k);
	}
}