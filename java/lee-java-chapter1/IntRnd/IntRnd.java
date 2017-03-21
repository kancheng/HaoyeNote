/* lhu java*/
import java.util.Random;
public class IntRnd{
	public static void main(String argv[]){
		Random rnd = new Random();
		System.out.print("Random value : ");
		for( int i = 0; i < 10; i++){
			int n = rnd.nextInt(10);
			/* print  random value*/
			System.out.print( n + "\t");
		}
	}
}