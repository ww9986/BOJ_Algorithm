import java.io.*;
import java.math.BigInteger;

public class boj_5893 { // 17배
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger bigInteger = new BigInteger(bufferedReader.readLine(), 2).multiply(BigInteger.valueOf(17));


        bufferedWriter.write(bigInteger.toString(2));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}