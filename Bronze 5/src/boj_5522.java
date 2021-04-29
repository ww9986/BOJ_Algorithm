import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_5522 { // 카드데임
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        int sum = 0;

        for (int i = 0; i < 5; i++)
            sum += Integer.parseInt(bufferedReader.readLine());

        System.out.println(sum);
    }
}