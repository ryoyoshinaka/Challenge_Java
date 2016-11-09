package utsystem;

public class Q3_21 {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		int j = 1;
		for(int i = 1;; i++){
			j = j * 10;
			int k = num / j;
			if(k == 0){
				System.out.println("整数値 " + num + " の桁数は、" + i + "ケタです。");
				break;
			}

		}

	}

}
