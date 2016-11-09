package utsystem;

public class Q3_12 {

	public static void main(String[] args) {
		System.out.println("身長		標準体重");
		for(int i = 150; i <= 180; i++){
			if(i % 5 == 0){
				System.out.println(i + "         " +(i-100)*0.9);
			}
		}
	}

}
