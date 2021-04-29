import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_8393 { // 합
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(bufferedReader.readLine()), sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println(sum);
    }
}
