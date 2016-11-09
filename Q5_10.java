package utsystem;

public class Q5_10{

	public static double myArea(int x){
		return x * x * 3.14;
	}

	public static int myArea(int x, int y) {
		return 	x * y;
	}

	public static void main(String[] args) {
		System.out.println("面積は" +  myArea(10) + "です。");
	}

}

