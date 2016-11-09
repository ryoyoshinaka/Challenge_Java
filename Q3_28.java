package utsystem;

public class Q3_28 {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 2; i <= num; i++ ){
			if(num % i == 0 && i < num){
			}else
				System.out.println(num + "は素数です.");
				break;
		}
	}

}
