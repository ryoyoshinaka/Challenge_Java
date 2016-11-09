package utsystem;

public class Q3_6 {

	public static void main(String[] args) {
		System.out.print("点数を入力してください:");
		int num = new java.util.Scanner(System.in).nextInt();
		if(num < 60){
			System.out.println("評価はDです。");
		}else if(num < 70 ){
			System.out.println("評価はCです。");
		}else if(num < 80){
			System.out.println("評価はBです。");
		}else if(num < 90){
			System.out.println("評価Aです。");
		}
	}

}
