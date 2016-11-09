package utsystem;

public class Q4_12 {

	public static void main(String[] args) {
		int[][] heya = { {101 , 4 , 1}, {102 , 4 , 1}, {201, 3, 1}, {202, 4, 1}, {301, 6, 1} };
		System.out.print("利用人数：");
		int ninzuu = new java.util.Scanner(System.in).nextInt();
		int check = 0;//

		System.out.print("空いている部屋は");

		for(int i = 0; i < 5; i++){

			if(ninzuu <= heya[i][1] && heya[i][2] == 0){	//
				System.out.print("," + heya[i][0] + "号室");
				check = 1;
			}

		}
		if(check == 0){
			System.out.println("ありません。");
		}else if(check == 1){
			System.out.println("です。");
		}
	}
}
