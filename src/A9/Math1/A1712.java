package A9.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1712 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static String[] strArr = null;
	static long bePoint = 0;
	static	long a = 0;
	static long b = 0;
	static long c = 0;
	
	public static void main(String[] args) throws IOException {
		String input = br.readLine();
		strArr = input.split(" ");
		a = Integer.parseInt(strArr[0]);
		b = Integer.parseInt(strArr[1]); 
		c = Integer.parseInt(strArr[2]);
		
		if (b >= c) {
			bw.write("-1");
			bw.flush();
			bw.close();
		} else {
			while (a + (b * bePoint) >= c * bePoint) {
				bePoint++;
			}
			bw.write("" + bePoint);
			bw.flush();
			bw.close();
		}
	}
}
