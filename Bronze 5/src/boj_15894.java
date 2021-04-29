import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_15894 { // 수학은 체육과목 입니다.
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        BigInteger num=new BigInteger(bufferedReader.readLine());

        System.out.println(num.multiply(BigInteger.valueOf(4)));

    }
}
