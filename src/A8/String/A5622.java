package A8.String;
//입력
//첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.
//
//출력
//첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.

// switch 사용하면 편했음...
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class A5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String input = "";
		int count = 0;
		
		for (int i = 65; i <= 67; i++) {
			map.put("" + ((char)i), 2);
		}
		for (int i = 68; i <= 70; i++) {
			map.put("" + ((char)i), 3);
		}
		for (int i = 71; i <= 73; i++) {
			map.put("" + ((char)i), 4);
		}
		for (int i = 74; i <= 76; i++) {
			map.put("" + ((char)i), 5);
		}
		for (int i = 77; i <= 79; i++) {
			map.put("" + ((char)i), 6);
		}
		for (int i = 80; i <= 83; i++) {
			map.put("" + ((char)i), 7);
		}
		for (int i = 84; i <= 86; i++) {
			map.put("" + ((char)i), 8);
		}
		for (int i = 87; i <= 90; i++) {
			map.put("" + ((char)i), 9);
		}
		
		input = br.readLine();
		char[] charArr = input.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			count += (map.get("" + charArr[i])) + 1;
		}
		
		bw.write("" + count);
		bw.flush();
		bw.close();
	}

}
