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
			/* �j�g���^��r�� ASCII + 32 �N�|�O�ۦP�p�g�� ASCII �s�X EX : 'A' + 32 -> 'a' */
			System.out.print(ch);
		}
	}
}