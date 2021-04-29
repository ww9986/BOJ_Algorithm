import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_3046 { // R2
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int R1 = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(S * 2 - R1);
    }
}
