import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_17496 { // 스타후르츠
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int t = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int p = Integer.parseInt(stringTokenizer.nextToken());
        int number = 0;

        for (int i = 1; i <= n; i += t)
            if (n < i + t)
                break;
            else
                number++;

        System.out.println(number * c * p);
    }
}
