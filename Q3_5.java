package utsystem;

public class Q3_5 {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		if(9 < num && num < 100){
			System.out.println("入力されたデータは2ケタの数字です。");
		}else
			System.out.println("入力されたデータは2ケタの数字ではありません。");
	}

}
