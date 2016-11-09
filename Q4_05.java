package utsystem;

public class Q4_05 {

	public static void main(String[] args) {
		System.out.print("要素数：");
		
		int ys = new java.util.Scanner(System.in).nextInt();
		int [] a = new int[ys];
		for(int i = 0; i < ys; i++){
			System.out.print("a[" + i + "]:");
			a[i] = new java.util.Scanner(System.in).nextInt();
		}
		System.out.print("探す数値：");
		int s = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < ys; i++){
			if(a[i] == s){
				System.out.println(s + "は、a[" + i + "]にあります。");
			}
		}
	}

}
