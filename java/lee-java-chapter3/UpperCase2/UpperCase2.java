/* lhu java*/
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class UpperCase2 {
	public static void main(String argv[]) {
		System.out.println("�P�_�O�_���^��r�� : ");	
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ){
			System.out.println( ch + " -> �O�^��r��");		
		}else{
			System.out.println( ch + " -> �D�^��r��");		
		}

	}
}