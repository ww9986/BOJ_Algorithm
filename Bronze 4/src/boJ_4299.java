import java.io.*;
import java.util.StringTokenizer;

public class boJ_4299 { // AFC 윔블던
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int sum = Integer.parseInt(stringTokenizer.nextToken());
        int sub = Integer.parseInt(stringTokenizer.nextToken());

        int a = (sum + sub) / 2;
        int b = (Math.abs(sum - sub)) / 2;

        if (-1 < sum && -1 < sub && a + b == sum && Math.abs(a - b) == sub)
            bufferedWriter.write(Math.max(a, b) == a ? a + " " + b : b + " " + a);
        else
            bufferedWriter.write("-1");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
