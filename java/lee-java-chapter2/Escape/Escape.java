/* lhu java*/
import java.util.Scanner;
public class Escape {
	public static void main(String argv[]) {
/* �m�߬q�� ���޸� �P ��޸�����X by ����r��
*		�r�� -> �d��
*		\\ -> �ϱ׽u
*		\' -> ��޸�
*		\" -> ���޸�
*		\b -> �˰h�@�Ӧr��
*		\f -> ����
*		\n -> ����
*		\r -> ��в��ܦ歺
*		\t -> ����( Tab )
*/
		System.out.print("This line have no line feed");
		System.out.print("Line Feed\n");
		System.out.print("tab\tkey\tcharacter\n");
		System.out.print("single quote \'\tdouble quote \"\tback slash\\");
	}
}