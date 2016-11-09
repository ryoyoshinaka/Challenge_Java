package utsystem;

public class Q6_08 {

	public static void main(String[] args) {

		int x = 5;

		Q6_08_Simple simple = new Q6_08_Simple(x);
		
		simple.x += 10;
		System.out.printf("x = " + simple.x);

	}

}
