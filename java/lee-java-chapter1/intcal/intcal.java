/* lhu java*/
import java.util.Scanner;
public class intcal {
	public static void main(String argv[]){
		Scanner input = new Scanner(System.in);
		System.out.println( "Please input 2 values : ");
		int n, m, addition, subtration, multiplication, division;
		n = input.nextInt();
		m = input.nextInt();
		addition = n + m;
		subtration = n - m;
		multiplication = n * m;
		division = n/m;
		System.out.println( "[ + ] : " + n + " + " + m + " = " + addition + "\r\n" +
				"[ - ] : " + n + " - " + m + " = " + subtration + "\r\n" +
				"[ * ] : " + n + " * " + m +" = " + multiplication + "\r\n" +
				"[ / ] : " + n + " / " + m + " = " + division + "\r\n" );
	}
}