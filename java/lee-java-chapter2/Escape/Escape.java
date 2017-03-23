/* lhu java*/
import java.util.Scanner;
public class Escape {
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
		System.out.print("This line have no line feed");
		System.out.print("Line Feed\n");
		System.out.print("tab\tkey\tcharacter\n");
		System.out.print("single quote \'\tdouble quote \"\tback slash\\");
	}
}