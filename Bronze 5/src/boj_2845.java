import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2845 { // 파티가 끝나고 난뒤
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");
        int people = 1;
        int[] news = new int[5];

        for (int i = 0; i < 2; i++)
            people *= Integer.parseInt(stringTokenizer1.nextToken());

        StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine(), " ");

        for (int i = 0; i < 5; i++)
            news[i] = Integer.parseInt(stringTokenizer2.nextToken()) - people;

        for (int num : news)
            System.out.print(num + " ");
    }
}
