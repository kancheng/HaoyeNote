/* lhu java*/
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class UpperCase {
	public static void main(String argv[]) {
		System.out.println("判斷是否為英文大寫字母 : ");	
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if( ch >= 'A' && ch <= 'Z'){
			System.out.println( ch + " -> 是大寫英文字母");		
		}else{
			System.out.println( ch + " -> 非大寫英文字母");		
		}

	}
}