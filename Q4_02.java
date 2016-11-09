package utsystem;

public class Q4_02 {

	public static void main(String[] args) {
		double [] number;
		number = new double[5];
		for(int i = 0; i < 5; i++){
			number[i] = i * 1 + i * 0.1;
			System.out.println("number[" + i + "] = " + number[i]);
		}
	}

}
