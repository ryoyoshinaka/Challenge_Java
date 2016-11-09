package utsystem;

public class Q4_10 {

	public static void main(String[] args) {
		int[] month = {0,31,60,91,121,151,182,213,244,274,305,335,366};
		int m = new java.util.Scanner(System.in).nextInt();
		int d = new java.util.Scanner(System.in).nextInt();
		int days = 0;

		days = d + month[m-1] - 1;

		System.out.println("通算日数＝" + days + "日です。");
	}

}
