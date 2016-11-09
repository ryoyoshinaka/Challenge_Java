package utsystem;

public class Sonyu_sort {

	public static void main(String[] args) {
		int work = 0;
		int task = 0;
		int[] ringo = {4,2,5,1,3};
		for(int i =0; i < ringo.length; i++){
			for(int j = 0; j < i; j++){
				if(ringo[i] < ringo[j]){
					work = ringo[i];
					for(int k = j; k < i; k++){
						task = ringo[k + 1];
						ringo[k + 1] = ringo[k];

					}
					ringo[j] = work;
				}

			}
		}
		for(int i = 0; i < ringo.length; i++){
			System.out.print(ringo[i] + " ");
		}
	}

}
