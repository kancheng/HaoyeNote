/* lhu java*/
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class UpperCase {
	public static void main(String argv[]) {
		System.out.println("�P�_�O�_���^��j�g�r�� : ");	
		Scanner input = new Scanner(System.in);
		char ch = input.next().charAt(0);

		if( ch >= 'A' && ch <= 'Z'){
			System.out.println( ch + " -> �O�j�g�^��r��");		
		}else{
			System.out.println( ch + " -> �D�j�g�^��r��");		
		}

	}
}