package recursion;

import java.util.ArrayList;
import java.util.List;

public class Josephu {

	public static void main(String[] args) {
		int n = 7; // Number of people
		int k = 3; // Step count saltos

		ganador(n, k);

	}

	private static void ganador(int n, int k) {
		List<Integer> personas = new ArrayList<Integer>();
		int cnt = 0;
		while (personas.size() < 7) {
			personas.add(cnt++);

		}
		System.out.println(personas.size());
	}

}
