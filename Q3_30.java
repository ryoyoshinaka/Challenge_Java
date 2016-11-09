package utsystem;

public class Q3_30 {

	public static void main(String[] args) {
		int year = new java.util.Scanner(System.in).nextInt();
		if((year % 4 == 0 && year % 100 > 0) || year % 400 == 0){
			System.out.println(year + "年はうるう年です。");
		}else
			System.out.println(year + "年はうるう年ではありません。");
	}

}
