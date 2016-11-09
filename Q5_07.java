package utsystem;

import java.util.Scanner;

public class Q5_07 {

	public static int[] arrayClone(int[] a){

		for(int i = 0; i < a.length; i++){
			arrayClone[i] = a[i];
		}

		return a ;

	}

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("要素数：");
		int num = stdln.nextInt();
		int[] x = new int[num];

		for(int i = 0; i < num; i++){

			System.out.print("x[" + i + "]:");
			x[i] = stdln.nextInt();

		}
		int[] y = arrayClone(x);
		System.out.println("配列 x の複製 y を作りました。");
		for(int i = 0; i < num; i++){
			System.out.println("[y" + i + "]=" + y[i]);
		}

	}

}
