package utsystem;

public class Q3_15 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		for(int i = 1; i <=n; i++){
			sum = sum + i;
		}
		System.out.println("合計値＝" + sum);
		System.out.println("平均値＝" + (double)sum/n);
	}

}
