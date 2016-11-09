package utsystem;

public class Q3_29 {

	public static void main(String[] args) {
		int ans = new java.util.Random().nextInt(11);
		System.out.println("0～10までの数を当ててください。");
		for(int i = 1;; i++){
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans){
				System.out.println("当たりです！！" + i + "回目で当たりました。");
				break;
			}else if(ans < num){
				System.out.println("もっと小さな数です。");
			}else if(num < ans){
				System.out.println("もっと大きな数です。");
			}
		}
	}

}
