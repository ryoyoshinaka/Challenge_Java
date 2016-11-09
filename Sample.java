package utsystem2;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add(0,"2");
		ar1.add(1,"4");
		ar1.add(2,"6");

		String mozi1 = ar1.get(0);
		String mozi2 = ar1.get(1);
		String mozi3 = ar1.get(2);

		System.out.println("mozi1");
		System.out.println("mozi2");
		System.out.println("mozi3");

		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(0,3);
		ar2.add(1,6);
		ar2.add(2,9);

		int kazu1 = ar2.get(0);
		int kazu2 = ar2.get(1);
		int kazu3 = ar2.get(2);

		System.out.println(kazu1);
		System.out.println(kazu2);
		System.out.println(kazu3);
	}

}
