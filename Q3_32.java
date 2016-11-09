package utsystem;

public class Q3_32 {

	public static void main(String[] args) {
		int m = new java.util.Scanner(System.in).nextInt();
		int n = new java.util.Scanner(System.in).nextInt();
		int r = 0;
		for(int i = 0;; i++){
			r = m % n;
			if(r == 0){
				System.out.println("最大公約数は" + n + "です。");
				break;
			}
			m = n;
			n = r;
		}

	}

}
