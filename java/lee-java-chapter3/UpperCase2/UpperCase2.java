/* lhu java*/
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class UpperCase2 {
	public static void main(String argv[]) {
		System.out.println("判斷是否為英文字母 : ");	
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ){
			System.out.println( ch + " -> 是英文字母");		
		}else{
			System.out.println( ch + " -> 非英文字母");		
		}

	}
}