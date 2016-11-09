package utsystem;

public class Q1_4 {

	public static void main(String[] args) {
		int[] score = { 80, 60, 40, 90, 50 };
		int sum = 0;
		int avg = 0;
		for(int i = 0; i < score.length; i++){
			sum = sum + score[i];
		}
		System.out.println("合計 ＝ " + sum + ("点"));
		avg = sum / score.length;
		System.out.println("平均 ＝ " + avg + "点");
	}

}
