package A9.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1193 {
	static void check(int number) {
		int brick = 0;
		int diagonal = 0;
		int x = 0;
		int y = 0;
		while (brick != number) {
			
			diagonal++;
			for (int i = 1; i <= diagonal; i++) {
				brick ++;
				if (brick == number) {
					if (diagonal % 2 != 0) {
						y = i;
						x = (diagonal + 1) - y;
					} else {
						x = i;
						y = (diagonal + 1) - x;
					}
					break;
				}
			}
			
		}
		System.out.println(x + "/" + y);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		check(number);
//		System.out.println());
		
		
	}

}
