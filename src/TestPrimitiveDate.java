/**
 * ���Ը�����
 * @author ����
 *
 */
public class TestPrimitiveDate {
	public static void main(String[] args) {
		float a =3.14F;
		double b =6.28;
		double c=628E-2;
		System.out.println(c);
		
		//�������ǲ���ȷ�ģ�һ����Ҫ���ڱȽϣ�
		float f=0.1f;
		double d=1.0/10;
		System.out.println(f==d);//���Ϊfalse
		float d1=423432423f;
		float d2=d1+1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
	}

}
