package utsystem;

public class Q4_06 {

	public static void main(String[] args) {
		System.out.print("要素数：");
		int yososuu = new java.util.Scanner(System.in).nextInt();
		int [] a = new int[yososuu];
		for(int i = 0; i < yososuu; i++){
			System.out.print("a[" + i + "]:");
			a[i] = new java.util.Scanner(System.in).nextInt();
		}
		System.out.print("探す数値：");
		int s = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i < yososuu; i++){
			if(a[yososuu -1 - i] == s){
				System.out.println(s + "は、a[" + (yososuu - 1 -i) + "]にあります。");
				break;
			}
		}
	}

}
