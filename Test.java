package utsystem;

public class Test {

	public static void main(String[] args) {
		char[][] graph = new char[10][10];
		for(int i = 0; i < 10; i++){

			for(int j = 0; j < 9 - i; j++){
				graph[i][j] = ' ';
			}

			for(int j = 0; j < i + 1 ; j++){
				graph[i][9 - i + j] = '*';
			}
		}
		for(int i = 0; i <10; i++){

			for(int j = 0; j < 10; j++){
				System.out.print(graph[i][j]);
			}

			System.out.println();

		}
	}

}
