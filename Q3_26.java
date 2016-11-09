package utsystem;

public class Q3_26 {

	public static void main(String[] args) {
		System.out.print("month＝");
		int month = new java.util.Scanner(System.in).nextInt();
		if(2 < month && month < 6){
			System.out.println("春ですね。");
		}else if(5 < month && month < 9){
			System.out.println("夏ですね。");
		}else if(8 < month && month < 12){
			System.out.println("秋ですね。");
		}else if(month == 12 || month < 3){
			System.out.println("冬ですね。");
		}
	}

}
