import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_8437 { // Julka
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        BigInteger a = new BigInteger(bufferedReader.readLine());
        BigInteger b = new BigInteger(bufferedReader.readLine());
        BigInteger small = (a.subtract(b)).divide(BigInteger.TWO);

        System.out.println(small.add(b));
        System.out.println(small);
    }
}
