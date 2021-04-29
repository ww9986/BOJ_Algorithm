import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_14928 { // 큰수 (BIG)
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        BigInteger n = new BigInteger(bufferedReader.readLine());

        System.out.println(n.divide(BigInteger.valueOf(20000303)));
    }
}
