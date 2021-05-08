import java.io.*;
import java.util.StringTokenizer;

public class boj_5596 { // 시험 점수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer mingug = new StringTokenizer(bufferedReader.readLine(), " ");
        StringTokenizer manse = new StringTokenizer(bufferedReader.readLine(), " ");

        int mingugScore = 0, manseScore = 0;

        for (int i = 0; i < 4; i++) {
            mingugScore += Integer.parseInt(mingug.nextToken());
            manseScore += Integer.parseInt(manse.nextToken());
        }

        bufferedWriter.write(String.valueOf(Math.max(mingugScore, manseScore)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
