
public class BallGame {
	public static void main(String[] args) {
		int i=3;
		int sum=(i++)+(i++)+(i++);//3+4+5
		System.out.println(i);
		System.out.println(sum);
		int a=1;
		int b=++a*(++a);//2*3
		int c=a++*(++a);//3*5
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
