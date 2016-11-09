package utsystem;

public class Q3_19 {

	public static void main(String[] args) {
		System.out.println("何個のデータですか？");
		int j = new java.util.Scanner(System.in).nextInt();
		int sum = 0;
		for(int i = 0; i < j; i++){
			int num = new java.util.Scanner(System.in).nextInt();
			sum = sum + num;
		}
		System.out.println("合計値＝" + sum + " 平均値＝" + sum / j);
	}

}
