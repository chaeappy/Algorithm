package A9.Math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A2869 {
	static double calculateCeil(double day) {
		day = ((day - ((int) day)) == 0) ? day : (int) day + 1;
			return day;
	}
	
      
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String msg = br.readLine();
		String[] strArr = msg.split(" ");
		double[] doubleArr = new double[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			doubleArr[i] = Integer.parseInt(strArr[i]);
		}
		
		double day = ((doubleArr[2] - doubleArr[0]) / (doubleArr[0] - doubleArr[1])) + 1;
		int dday = (int) (calculateCeil(day));
		bw.write(dday + "");
		bw.flush();
		bw.close();
		
		
	}

}