import java.io.*;
import java.util.StringTokenizer;

public class boj_5928 { // Contest Timing

    final static int StartTime = 16511;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer endTime = new StringTokenizer(bufferedReader.readLine(), " ");

        int endMinute = Integer.parseInt(endTime.nextToken()) * 24 * 60 + Integer.parseInt(endTime.nextToken()) * 60 + Integer.parseInt(endTime.nextToken());

        bufferedWriter.write((endMinute - StartTime) > -1 ? String.valueOf(endMinute - StartTime) : "-1");
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
