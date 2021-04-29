import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_16394 { // 홍익 대학교
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int year = Integer.parseInt(bufferedReader.readLine());

        System.out.println(year - 1946);
    }
}
