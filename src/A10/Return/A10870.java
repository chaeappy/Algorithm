package A10.Return;

import java.util.ArrayList;
import java.util.Scanner;

public class A10870 {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		fibonacci(input);
		System.out.println(list.get(input));
	}

	static void fibonacci(int input) {
		for (int i = 0; i <= input; i++) {
			if (i == 0 || i ==1)
				list.add(i);
			else 
				list.add(list.get(i - 1) + list.get(i - 2));
		}
	}
}