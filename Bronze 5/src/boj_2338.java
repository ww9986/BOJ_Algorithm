import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_2338 { // 긴자리 계산
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        BigInteger a = new BigInteger(bufferedReader.readLine());
        BigInteger b = new BigInteger(bufferedReader.readLine());

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
