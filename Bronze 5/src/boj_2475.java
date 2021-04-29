import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2475 { // 검증수
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int answer = 0;

        for (int i = 0; i < 5; i++)
            answer += Math.pow(Integer.parseInt(stringTokenizer.nextToken()), 2);

        System.out.println(answer % 10);
    }
}
