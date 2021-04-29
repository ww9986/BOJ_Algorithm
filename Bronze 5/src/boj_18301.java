import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_18301 { // Rats
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n_1 = Integer.parseInt(stringTokenizer.nextToken());
        int n_2 = Integer.parseInt(stringTokenizer.nextToken());
        int n_12 = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println((n_1 + 1) * (n_2 + 1) / (n_12 + 1) - 1);
    }
}
