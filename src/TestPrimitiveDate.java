/**
 * 测试浮点型
 * @author 江杰
 *
 */
public class TestPrimitiveDate {
	public static void main(String[] args) {
		float a =3.14F;
		double b =6.28;
		double c=628E-2;
		System.out.println(c);
		
		//浮点型是不精确的，一定不要用于比较！
		float f=0.1f;
		double d=1.0/10;
		System.out.println(f==d);//结果为false
		float d1=423432423f;
		float d2=d1+1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
	}

}
