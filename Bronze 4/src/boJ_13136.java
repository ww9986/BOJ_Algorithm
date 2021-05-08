import java.io.*;
import java.util.StringTokenizer;

public class boJ_13136 { // Do Not Touch Anything
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int r = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write(String.valueOf((long) ((r % n == 0) ? r / n : r / n + 1) * ((c % n == 0) ? c / n : c / n + 1)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
