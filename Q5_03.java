package utsystem;

import java.util.Scanner;

public class Q5_03 {

	public static int SumUp(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++ ){
			sum = sum + i;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.println("1から x までの和を求めます");
		int x;

		do{
		System.out.print("整数 x:");
		x = stdln.nextInt();
		}while(x <= 0);
		System.out.println("1から" + x +  "までの和は" + SumUp(x) + "です。");
	}

}
