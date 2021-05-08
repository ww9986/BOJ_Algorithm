import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2480 { // 주사위 세개
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if (a == b && b == c)
            System.out.println(10000 + 1000 * a);
        else if (a == b)
            System.out.println(1000 + 100 * a);
        else if (b == c)
            System.out.println(1000 + 100 * b);
        else if (a == c)
            System.out.println(1000 + 100 * a);
        else
            System.out.println(Math.max(Math.max(a, b), c) * 100);

    }
}
