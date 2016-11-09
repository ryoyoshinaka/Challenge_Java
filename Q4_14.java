package utsystem;

public class Q4_14 {

	public static void main(String[] args) {

		int[] koka = {10, 50, 100, 500};
		int[] hbk = new int [4];
		int[] tk = new int [4];
		int[] mai = new int[4];

		System.out.println("お金をいれてください。");

		for(int i = 0; i < 4; i++){

			System.out.print(koka[i] + "は何枚？");
			tk[i] = new java.util.Scanner(System.in).nextInt();

		}

		int sum = 0;

		for(int i = 0; i <  3; i ++){

			sum = sum + tk[i] * koka[i];

		}

		if(sum >= 150){

			int otr = sum - 150;

		}else
			System.out.println("入金不足");

		for(int i = 0; i < 4; i++){

			hbk[i] = hbk[i] + tk[i];
			mai[i] = 0;

		}


	}

}
