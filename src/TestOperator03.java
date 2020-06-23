
/**
 * 测试逻辑运算符
 * @author 江杰
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
		//短路
		boolean b3=1>2&&2<(3/0);  //短路与，第一个为false，第二个不需要算
		System.out.println(b3);
	}

}
