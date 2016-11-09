package utsystem;

public class SampleTest64 {

	public static void main(String[] args) {

		Sample64 x = new Sample64(1, 2, 3);
		Sample64 y = new Sample64(2, 4, 6);

		int xs = x.getSum();
		int ys = y.getSum();
		System.out.print("x : ");
		x.print();
		System.out.println("xs : " + xs);
		y.print();
		System.out.println("ys : " + ys);


	}

}
