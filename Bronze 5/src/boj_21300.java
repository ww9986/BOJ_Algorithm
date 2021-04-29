import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_21300 { // Bottle Return
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int sum = 0;

        for (int i = 0; i < 6; i++)
            sum += Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(5 * sum);
    }
}
