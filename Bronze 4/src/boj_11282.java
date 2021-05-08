import java.io.*;

public class boj_11282 { // 한글
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf((char) (n + 44031)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
