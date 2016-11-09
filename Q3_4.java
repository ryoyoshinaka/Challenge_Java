package utsystem;

public class Q3_4 {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		if(x % y == 0){
			System.out.println(x + "は" + y + "で割り切れます。");
		}else
			System.out.println(x + "は" + y + "で割り切れません。");
	}

}
