/* lhu java*/
import java.util.Scanner;
public class haoyeEscape {
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