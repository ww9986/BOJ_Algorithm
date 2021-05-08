import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1008 { // A/B
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        double a = Double.parseDouble(stringTokenizer.nextToken());
        double b = Double.parseDouble(stringTokenizer.nextToken());

        System.out.println(a / b);
    }
}
