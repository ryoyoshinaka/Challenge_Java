package utsystem;

public class Q4_07 {

	public static void main(String[] args) {
		boolean hantei = true;//数字がかぶっているか判定する値
		System.out.print("要素数：");
		int ys = new java.util.Scanner(System.in).nextInt();//要素数を指定
		int [] a = new int[ys];//要素数だけの配列を用意

		for(int i = 0; i < ys; i++){

			do{
				a[i] = new java.util.Random().nextInt(10) + 1;

				for(int j = 0; j < i; j++){

					if(a[i] == a[j]){
						hantei = false;
						break;
					}
					hantei = true;
				}

			}while(hantei == false);

			System.out.println("a[" + i + "] = " + a[i]);

		}
	}

}
