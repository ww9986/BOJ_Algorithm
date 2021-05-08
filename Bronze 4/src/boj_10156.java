import java.io.*;
import java.util.StringTokenizer;

public class boj_10156 { // 과자
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int k = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf(Math.max(k * n - m, 0)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}