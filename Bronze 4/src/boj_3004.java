import java.io.*;

public class boj_3004 { // 체스판 조각
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());
        int row = n / 2 + 1;
        int col = n - row + 2;

        bufferedWriter.write(String.valueOf(row * col));

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();

    }
}
