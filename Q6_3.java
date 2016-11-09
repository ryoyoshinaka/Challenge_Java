package utsystem;

public class Q6_3 {

	public static void main(String[] args) {

		MyClass2 mc = new MyClass2();
		mc.v1 = 100;
		mc.v2 = 200;

		mc.add();
		mc.calc(300, 400);
		System.out.println(mc.addcalc(500, 600));
	}

}
