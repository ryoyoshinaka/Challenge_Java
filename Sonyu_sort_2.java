package utsystem;

public class Sonyu_sort_2 {

	public static void main(String[] args) {
		int[] apples = {4,2,5,1,3};
		int work = 0;
		for(int kai = 1; kai < apples.length; kai++ ){

			for(int suu = kai - 1; suu >= 0; suu--){
				if(apples[suu] > apples[suu + 1]){
					work = apples[suu];
					apples[suu] = apples[suu + 1];
					apples[suu + 1] = work;
				}else if(apples[suu] <= apples[suu + 1]){
					break;
				}
			}
		}
		for(int i = 0; i < apples.length; i++){
			System.out.print(apples[i] + " ");
		}
	}

}
