
/**
 * �����߼������
 * @author ����
 *
 */
public class TestOperator03 {
	public static void main(String[] args) {
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);
		System.out.println(!b1);
		//��·
		boolean b3=1>2&&2<(3/0);  //��·�룬��һ��Ϊfalse���ڶ�������Ҫ��
		System.out.println(b3);
	}

}
