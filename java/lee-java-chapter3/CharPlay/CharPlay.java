/* lhu java*/
import java.lang.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class CharPlay {
	public static void main(String argv[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("�P�_�r���� ��J ch �� : ");
		char ch = input.next().charAt(0);

		if( ch >= '0' && ch <= '9' ){
			System.out.println( ch + " -> �O�Ʀr�r��");
		}else{
			System.out.println( ch + " -> ���O�Ʀr�r��");
		}

		 if( ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
			System.out.println( ch + " -> �O��Ʀr");
		}else {
			System.out.println( ch + " -> ���O��Ʀr");
		}

		if(!( ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'||ch == ' ' || ch == '\t' || ch == '\n' )){
			System.out.println( ch + " -> �O���I�Ÿ�");	
		}else {
			System.out.println( ch + " -> ���O���I�Ÿ�");
		}

		if( ch == ' ' || ch == '\t' || ch == '\n'){
			System.out.println( ch + " -> �O�ťղŸ�");
		} else{
			System.out.println( ch + " -> ���O�ťղŸ�");
		}

	}
}
