package utsystem;

public class Q3_9 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		System.out.print("コーヒーの定価＝");
		int t = new java.util.Scanner(System.in).nextInt();
		System.out.print("入金額＝");
		int n = new java.util.Scanner(System.in).nextInt();
		if(t < n){
			x = (n - t) / 100;
			y = ((n-t) % 100 / 50);
			z = ((n-t) % 100 % 50 / 10);
		System.out.println("お釣り＝100円硬貨は " + x + " 枚、50円硬貨 " + y + " 枚、10円硬貨は" + z + " 枚です。"
				);
		}else
			System.out.println("入金額が足りません。");
	}

}
