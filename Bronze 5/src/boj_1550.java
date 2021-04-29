import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_1550 { // 16진수
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String[] strings = bufferedReader.readLine().split("");
        int answer = 0;


        for (int i = 0; i < strings.length; i++) {
            switch (strings[i]) {
                case "A" -> strings[i] = "10";
                case "B" -> strings[i] = "11";
                case "C" -> strings[i] = "12";
                case "D" -> strings[i] = "13";
                case "E" -> strings[i] = "14";
                case "F" -> strings[i] = "15";
            }
                answer += Integer.parseInt(strings[i]) * (int) Math.pow(16, strings.length - i - 1);
        }
        System.out.println(answer);
    }
}
