/* lhu java*/
import java.util.Scanner;
public class CharOctHex {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
			char ch = 'A';
			char chOct = '\101';
			char chHex = '\u0041';
			/* 上面三個 char 值 皆代表 大寫 'A'
			EX : ch,  chOct, chHex */
			System.out.print( "單引表示 \'A\' : " + ch + "\t" + "Oct 8 進位 A : " + chOct + "\t" + " Hex 16 進位 A : " + chHex);
	}
}