package frameworkCollection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> Ts = new TreeSet<Integer>();
		Ts.add(23);
		Ts.add(78);
		Ts.add(23);
		Ts.add(12);
		Ts.add(11);
		Ts.add(9);
		Ts.add(56);
		System.out.println(Ts);
		System.out.println(Ts.size());
		for(int X : Ts) {
			System.out.println(X);
	}

	}
}