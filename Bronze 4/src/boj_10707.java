import java.io.*;

public class boj_10707 { // 수도요금
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int p = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf(Math.min(a * p, (p < c) ? b : b + (p - c) * d)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}