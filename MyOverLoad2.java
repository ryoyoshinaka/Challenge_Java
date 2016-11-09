package utsystem;

public class MyOverLoad2 {

	public static void myArea(int x){
		System.out.println("面積は" + (x * x * 3.14) + "です。");
	}

	public static void myArea(int x, int y) {
		System.out.println("面積は" + (x * y) + "です。");
	}
}

class MyOverLoad2Test{
	public static void main(String[] args) {
		int x = 4;
		int y = 8;

	}

}
