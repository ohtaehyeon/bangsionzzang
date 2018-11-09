

class Caculator{
	public int plus(int a, int b) {
		return a+b;
	}
	public int plus(int a, int b, int c) {
		return a+b+c;
	}
	public float plus(float a, float b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiple(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
}

public class OverloadingMain {
	
	public static void main(String[] args) {
		
		Caculator calc = new Caculator();
		
		int x = 10;
		int y = 20;
		
		int z = calc.plus(x,  y);
		System.out.println("z = " + z);
		
		float a = calc.plus(3.14f, 2.14f);
		System.out.println("a = " + a);
	}

}
