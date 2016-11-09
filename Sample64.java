package utsystem;

public class Sample64 {

	private int a;
	private int b;
	private int c;

	//コンストラクタ
	Sample64(int a , int b, int c){

		this.a = a;
		this.b = b;
		this.c = c;

	}

	//a,b,c の和を取得
	int getSum(){

		return a + b + c;

	}

	//a,b,cの値を表示して改行
	void print(){

		System.out.println("a = " + a + "b = " + b + "c = " + c);

	}

}
