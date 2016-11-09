package utsystem;

public class MyClass2 {

	int v1;
	int v2;

	public void add(){

		System.out.println(v1 * v2);

	}

	public void calc(int a, int b){

		System.out.println(a * b);

	}

	public String addcalc(int x, int y){

		String answer = "正解" + (x + y);
		return answer;

	}
}
