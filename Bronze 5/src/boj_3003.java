import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3003 { // 킹, 퀸, 룩, 바숍, 나이트, 폰
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] answer = new int[stringTokenizer.countTokens()];

        for (int i = 0; i < answer.length; i++) {
            if (i < 2)
                answer[i] = 1 - Integer.parseInt(stringTokenizer.nextToken());
            else if (i < 5)
                answer[i] = 2 - Integer.parseInt(stringTokenizer.nextToken());
            else
                answer[i] = 8 - Integer.parseInt(stringTokenizer.nextToken());

            System.out.print(answer[i] + " ");
        }
    }
}
