package utsystem;

public class Q3_17 {

	public static void main(String[] args) {
		int x = 0;
		for(int i = 0; i < 10; i++){
			int num = new java.util.Scanner(System.in).nextInt();
			if(num > x){
				x = num;
			}
		}
		System.out.println("最大値＝" + x);
	}

}
