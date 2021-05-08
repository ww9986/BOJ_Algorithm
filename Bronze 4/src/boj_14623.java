import java.io.*;

public class boj_14623 { // 감정이입
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String B1 = bufferedReader.readLine();
        String B2 = bufferedReader.readLine();

        long B1_10 = Integer.parseInt(B1, 2);
        long B2_10 = Integer.parseInt(B2, 2);

        bufferedWriter.write(Long.toBinaryString(B1_10 * B2_10));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
