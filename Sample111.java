package utsystem;

public class Sample111 {

	public static void main(String[] args) {
		SubSuper s = new SubSuper();
		s.a = 5; s.b = 10;
		s.x = 15; s.y = 20;
		System.out.println(s.calc());
	}

}
