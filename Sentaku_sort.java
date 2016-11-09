１package utsystem;

public class Sentaku_sort {

	public static void main(String[] args) {
		int work = 0;
		int syo = 0;
		int[] ringo = {4,2,5,1,3};
		for(int kai = 0; kai < ringo.length - 1; kai++){
			syo = kai;
			for(int suu = kai + 1; suu < ringo.length; suu++){
				if(ringo[syo] > ringo[suu]){
					syo = suu;
				}
			}
			if(kai != syo){
				work = ringo[kai];
				ringo[kai] = ringo[syo];
				ringo[syo] = work;
			}
		}
		for(int i = 0; i < 5; i++){
			System.out.print(ringo[i] + " ");
		}
	}

}
