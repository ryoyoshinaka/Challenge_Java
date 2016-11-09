package utsystem;

public class MyMember {
	static int myStatic = 10;
	int myInstance = 100;

	public static void main(String[] args) {

		myStatic = 20;
		System.out.println(myStatic);
		MyMember obj = new MyMember();
		obj.myInstance =200;
		System.out.println(obj.myInstance);

	}

}
