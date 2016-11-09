package utsystem;

public class Q4_03 {

	public static void main(String[] args) {
		char[] s = {'U','T','S','Y','S','T','E','M'};
		char j = 0;

		for(int n = 0; n < 8; n++){
			System.out.print(s[n] + " ");
		}
		System.out.println("");
		for(int i = 0; i < s.length-1; i++){
			for(int k = 0;k<s.length - (1 + i); k++){
			j = s[k];
			s[k] = s[k+1];
			s[k+1] = j;
			}
		}

		for(int n = 0; n < 8; n++){
				System.out.print(s[n] + " ");
		}
	}

}
