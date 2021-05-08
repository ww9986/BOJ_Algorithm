import java.io.*;
import java.util.StringTokenizer;

public class boj_8718 { // Bałwanek
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int all = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        if (7 * k <= all)
            bufferedWriter.write(String.valueOf(7 * k * 1000));
        else if (3.5 * k <= all)
            bufferedWriter.write(String.valueOf((int) (3.5 * 1000 * k)));
        else if (1.75 * k <= all)
            bufferedWriter.write(String.valueOf((int) (1.75 * 1000 * k)));
        else
            bufferedWriter.write("0");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
