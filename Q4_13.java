package utsystem;

public class Q4_13 {

	public static void main(String[] args) {
		System.out.print("要素数：");
		int ys = new java.util.Scanner(System.in).nextInt();
		int[] num = new int[ys];
		int x = 0;

		for(int i = 0; i < ys; i++){
			int r = new java.util.Random().nextInt(10);
			num[i] = r;
		}

		char[][] graph = new char[10][10];
		for(int i = 0; i < 10; i++){

			for(int j = 0; j < 9 - i; j++){
				graph[i][j] = ' ';
			}

			for(int j = 0; j < i + 1 ; j++){
				graph[i][9 - i + j] = '*';
			}

		}

		for(int i = 0; i < 10; i++){

			for(int j = 0; j < ys; j++){
				x = num[j];
				System.out.print(graph[i][x] + " ");
			}

			System.out.println();

		}

		for(int i = 0; i < 2 * ys; i++){
			System.out.print("-");
		}

		System.out.println();
		for(int i = 0; i < ys; i++){
			int h = i % 10;
			System.out.print(h + " ");
			}
	}

}
