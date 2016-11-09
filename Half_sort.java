package utsystem;

public class Half_sort {

	public static void main(String[] args) {
		String[] simei = {"あいこ","かなみ","さゆり","たろう","ななみ","はるこ","まき","やすよ","らん","わかこ"};
		int h = 0;
		int o = 9;
		System.out.print("名前を入力してください：");
		String name = new java.util.Scanner(System.in).nextLine();
		int t = 0;

		for(int i = h; i <= o; i++){
			System.out.print("う");
			System.out.println(simei[i]);
			t = h + o / 2;

			if(name.compareTo(simei[t]) == 0){

				System.out.println(t + "番の" + name + "さん");
				break;

			}else if(simei[t].compareTo(name) == -1){
				System.out.println("あ");

				h = t + 1;

			}else
				System.out.println("い");
				o = t - 1;

		}

	}

}
