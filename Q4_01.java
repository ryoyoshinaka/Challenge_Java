package utsystem;

public class Q4_01 {

	public static void main(String[] args) {
		int[] number;
		number = new int[5];
		for(int i = 0; i < number.length; i++){
			number[i] = 5 - i;
			System.out.println("number[" + i + "] = " + number[i]);
		}
	}

}
