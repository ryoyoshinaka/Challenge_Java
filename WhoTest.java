package utsystem;

class SuperClass{

	String name;
	SuperClass(){

		System.out.println("I am john.");

	}
	SuperClass(String name){
		this();
		this.name = name;
		System.out.printf("I am a father of %s.\n", name);
	}
}

class SubClass extends SuperClass{
	String name;
	SubClass(String name){
		super("johnson");
		System.out.printf("I am a son of %s.\n", name);
	}
}

public class WhoTest {
	public static void main(String[] args){
		SubClass johnson = new SubClass("John");
	}

}
