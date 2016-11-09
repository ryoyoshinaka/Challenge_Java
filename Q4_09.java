package utsystem;

public class Q4_09 {

	public static void main(String[] args) {
		int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		int m = new java.util.Scanner(System.in).nextInt();
		int d = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		int days = 0;

		for(int i = 0; i < m; i++){
			sum =  sum + month[i];
		}
		days = d + sum - 1;

		System.out.println("通算日数＝" + days + "日です。");
	}

}
