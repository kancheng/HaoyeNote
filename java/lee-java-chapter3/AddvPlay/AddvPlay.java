/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class AddvPlay {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		System.out.println(" ��l�� n = 0 \n Detail : �ҩ� n++ �P ++n �������p��t�� �C");
		int n1 = 0;
		int n2 = 0;
		n1 = n1++ + ++n1;
		System.out.println(" n++ + ++n : " + n1);
		n2 = ++n2 + n2++;
		System.out.println(" ++n + n++ : " + n2);
	}
}
