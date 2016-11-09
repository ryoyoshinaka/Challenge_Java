package utsystem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample3_03 {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		Scanner stdln = new Scanner(System.in);
		System.out.print("何回入力しますか？：");
		int num = stdln.nextInt();

		for(int i = 1; i <= num; i++){
			System.out.print(i + "個目の値を入力してください：");
			String name = stdln.nextLine();
			data.add(i-1,name);
		}
		System.out.println("入力されたデータは");
		for(String n : data){
			System.out.println(n);
		}
		System.out.println("です。");
	}
}
