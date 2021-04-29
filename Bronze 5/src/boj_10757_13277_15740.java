import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj_10757_13277_15740 { // 큰 수 A+B, 큰 수 곱셈, A+B - 9
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        System.out.print("문제 번호를 입력하세요 > ");
        int ID = Integer.parseInt(bufferedReader.readLine());

        BigInteger a = new BigInteger(bufferedReader.readLine());
        BigInteger b = new BigInteger(bufferedReader.readLine());

        if (ID == 10757 || ID == 15740)
            System.out.println(a.add(b));
        else if (ID == 13277)
            System.out.println(a.multiply(b));
    }
}