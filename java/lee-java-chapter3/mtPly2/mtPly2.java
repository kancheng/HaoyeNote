/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class mtPly2 {
	public static void main(String argv[]) {
		System.out.println("Detail : �D�� ����ȡB����B�ߤ�B�ڸ� \n ");
		Scanner input = new Scanner(System.in);
		System.out.print(" input n  value : ");
		double n = input.nextDouble();
		double n1, n2, n3, n4;
		n1 = Math.abs(n);
		n2 = ( n * n );
		n3 = ( n * n * n);
		n4 = Math.sqrt(n);
		System.out.println( " 1. ����� : " + n1);
		System.out.println( " 2. ���� : " + n2);
		System.out.println( " 3. �ߤ� : " + n3);
		System.out.println( " 4. �ڸ��� : " + n4);
	}
}