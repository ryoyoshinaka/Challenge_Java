package utsystem;

public class Q3_31 {

	public static void main(String[] args) {
		System.out.println("グー：１　チョキ：２　パー：３");
		System.out.print("太郎さん：");
		int t = new java.util.Scanner(System.in).nextInt();
		System.out.print("花子さん：");
		int h = new java.util.Scanner(System.in).nextInt();
		if((t == 1 && h == 2) || (t == 2 && h == 3) || (t == 3 && h == 1)){
			System.out.println("太郎さんの勝ちです。");
		}else if((t == 1 && h == 3) || (t == 2 && h == 1) || (t == 3 && h == 2)){
			System.out.println("花子さんの勝ちです。");
		}else
			System.out.println("あいこです。");
	}

}
