package utsystem;

public class Q3_23 {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		if(num < 100 || 999 < num){
			System.out.println("入力されたデータは3ケタの整数値ではありません。");
		}
	}

}
