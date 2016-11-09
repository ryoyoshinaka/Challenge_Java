package utsystem;

public class Q3_20 {

	public static void main(String[] args) {
		int sum = 0;
		int j = 0;
		for(int i = 0; i < 10; i++ ){
			int num = new java.util.Scanner(System.in).nextInt();
			sum = sum + num;
			if(num == 0){
				j = i;
				break;
			}
		}
		System.out.println("合計値＝" + sum + " 平均値＝" + (double)sum / j);
	}

}
