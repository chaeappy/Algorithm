package A10.Return;

import java.util.Scanner;

public class A10872 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		int number = sc.nextInt();
		System.out.println(loop(number));
		
	}
	
	static int loop(int number) {
		if (number == 1 || number == 0) {
			return 1;
		} else {
			return number * loop(--number);
		}
	}
		
}