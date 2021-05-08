import java.io.*;
import java.util.StringTokenizer;

public class boj_8710 { // Koszykarz
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int k = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf((w - k) % m == 0 ? (w - k) / m : (w - k) / m + 1));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}