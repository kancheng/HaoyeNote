/* lhu java*/
import java.util.Scanner;
public class CharOctHex {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
			char ch = 'A';
			char chOct = '\101';
			char chHex = '\u0041';
			/* �W���T�� char �� �ҥN�� �j�g 'A'
			EX : ch,  chOct, chHex */
			System.out.print( "��ު�� \'A\' : " + ch + "\t" + "Oct 8 �i�� A : " + chOct + "\t" + " Hex 16 �i�� A : " + chHex);
	}
}