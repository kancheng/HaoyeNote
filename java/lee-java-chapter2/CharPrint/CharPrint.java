/* lhu java*/
import java.util.Scanner;
public class CharPrint {
	public static void main(String argv[]) {
		System.out.print("Upper Case : ");
		for( char i = 'A'; i <= 'Z'; i++ ) {
			System.out.print(i);
		}
		System.out.print("\nLower Case : ");
		for( char i = 'A'; i <= 'Z'; i++) {
			char ch = (char)(i+32);
			/* 大寫的英文字母 ASCII + 32 就會是相同小寫的 ASCII 編碼 EX : 'A' + 32 -> 'a' */
			System.out.print(ch);
		}
	}
}