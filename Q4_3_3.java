package utsystem;

public class Q4_3_3 {

	public static void main(String[] args) {;
		String[] s = {"U","T","S","Y","S","T","E","M"};
		for(int i = 0; i < s.length/2 ; i++){

			 int k = 7 - i;
			String j = s[i];
			s[i] = s[k];
			s[k] = j;
		}
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i] + " ");;
		}
	}

}
