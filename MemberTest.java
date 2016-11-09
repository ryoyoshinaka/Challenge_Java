package utsystem;

public class MemberTest {

	public static void main(String[] args){
		Member ryo = new Member("吉中", 1, 23);

		ryo.print();
		ryo.setNo(2);
		ryo.print();
	}

}
