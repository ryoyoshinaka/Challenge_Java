package utsystem;

public class Q3_18 {

	public static void main(String[] args) {
		int min = new java.util.Scanner(System.in).nextInt();

		for(int i = 0; i < 9; i++){
			int num = new java.util.Scanner(System.in).nextInt();
			if(num < min){
				min = num;
			}
		}
		System.out.println("最小値＝" + min);
	}

}
