import java.io.*;
import java.util.StringTokenizer;

public class boj_13866 { // 팀 나누기
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf(Math.abs((a + d) - (b + c))));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}