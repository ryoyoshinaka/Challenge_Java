package utsystem;

public class Q4_03_2 {

	public static void main(String[] args) {
		char j = 0;
		char[] s = {'U','T','S','Y','S','T','E','M'};
		for(int i = 0; i < s.length / 2; i++){
			j = s[i];
			s[i] = s[7 - i];
			s[7 - i] = j;
		}
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i] + " ");
		}
	}

}
