package A9.Math1;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int howMany = sc.nextInt();
		int number = 1;
		int count = 1;
		
		while (number < howMany) {
			number += count * 6;
			count++;
		}
		System.out.println(count);
	} // main
}
