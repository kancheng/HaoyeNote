/* lhu java*/
import java.util.Scanner;
public class haoyeEscape {
	public static void main(String argv[]) {
/* 練習段落 雙引號 與 單引號的輸出 by 跳脫字元
*		字元 -> 範例
*		\\ -> 反斜線
*		\' -> 單引號
*		\" -> 雙引號
*		\b -> 倒退一個字元
*		\f -> 換頁
*		\n -> 換行
*		\r -> 游標移至行首
*		\t -> 跳格( Tab )
*/
		System.out.print("Print 1 : Today is 2017\\3\\23 \n");
		System.out.print("Print 2 : My name is \"Haoye Kan\" \n");
		System.out.print("Print 3 :  \n");
		System.out.println("\t \t \t 2017\\March \n"
				+ "Sun\tMon\tTue\tWeb\tThu\tFri\tSat \n"
				+ "1\t2\t3\t4\t5\t6\t7\n"
				+ "8\t9\t10\t11\t12\t13\t14\n"
				+ "15\t16\t17\t18\t19\t20\t21\n"
				+ "22\t23\t24\t25\t26\t27\t28\n");
	}
}