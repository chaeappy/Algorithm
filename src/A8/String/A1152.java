package A8.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			String str = br.readLine();
			
			if (!str.equals(" ") && !str.equals("")) {
				String[] arr = str.trim().split(" ");
					bw.write("" + arr.length);
					bw.flush();
			} else {
				bw.write("0");
				bw.flush();
			}
			bw.close();
	}
}