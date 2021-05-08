import java.io.*;
import java.util.StringTokenizer;

public class boj_13597 { // Tri-du
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf(Math.max(a, b)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
