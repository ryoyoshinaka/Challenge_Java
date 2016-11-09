package utsystem;

import java.util.Scanner;

public class Q5_02 {

	public static int min(int a, int b, int c){
		int min = 0;
		if(a < b){
			min = a;
			if(c < a){
				min = c;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);


		System.out.print("整数 a:");int a = stdln.nextInt();
		System.out.print("整数 b:");int b = stdln.nextInt();
		System.out.print("整数 c:");int c = stdln.nextInt();

		System.out.println("最小値は" + min(a,b,c) + "です。");
	}

}
