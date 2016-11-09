package utsystem;

public class Q3_7 {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		int x = 0;
		if(num < 3000){
			x =(int)(num * 1.08 + 500);
		}else{
			x =(int)(num * 1.08);
		}
		System.out.println("支払金額は、" + x + "円です。");
	}

}
