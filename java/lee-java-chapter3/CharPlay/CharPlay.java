/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class CharPlay {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("耞じ 块 ch  : ");
		char ch = input.next().charAt(0);

		if( ch >= '0' && ch <= '9' ){
			System.out.println( ch + " -> 琌计じ");
		}else{
			System.out.println( ch + " -> ぃ琌计じ");
		}

		 if( ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
			System.out.println( ch + " -> 琌ゅ计");
		}else {
			System.out.println( ch + " -> ぃ琌ゅ计");
		}

		if(!( ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'||ch == ' ' || ch == '\t' || ch == '\n' )){
			System.out.println( ch + " -> 琌夹翴才腹");	
		}else {
			System.out.println( ch + " -> ぃ琌夹翴才腹");
		}

		if( ch == ' ' || ch == '\t' || ch == '\n'){
			System.out.println( ch + " -> 琌フ才腹");
		} else{
			System.out.println( ch + " -> ぃ琌フ才腹");
		}

	}
}
