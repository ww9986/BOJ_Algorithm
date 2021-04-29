import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_20492 { // 세금
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println((int) (n * 0.78) + " " + (int) (n * 0.8 + n * 0.2 * 0.78));
    }
}
