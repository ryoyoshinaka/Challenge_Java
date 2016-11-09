package utsystem;

public class Q3_16 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++){
			int num = new java.util.Scanner(System.in).nextInt();
			sum = sum + num;
		}
		System.out.println("合計値＝" + sum);
		System.out.println("平均値＝" + (double)sum/10);
	}

}
