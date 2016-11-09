package utsystem;

public class Q4_11 {

	public static void main(String[] args) {
		int sum = 0;
		int[][] deta = {{100, 200}, {150, 300}, {200, 140}, {250, 60}, {300, 350}};

		for(int i = 0; i < 5; i++){
				sum = sum + deta[i][0] * deta[i][1];
		}
		System.out.println("売上データ＝" + sum + "円です。");
	}

}
