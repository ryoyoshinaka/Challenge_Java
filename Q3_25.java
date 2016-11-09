package utsystem;

public class Q3_25 {

	public static void main(String[] args) {
		System.out.print("a?");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.print("d?");
		int d = new java.util.Scanner(System.in).nextInt();
		System.out.print("n?");
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < n; i++){
			int sum = a + i * d;
			System.out.print(sum + " " );
		}
	}

}
