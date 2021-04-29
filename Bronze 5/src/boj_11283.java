import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_11283 { // 한글
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        System.out.println((int) bufferedReader.readLine().charAt(0) - 44031);
    }
}
