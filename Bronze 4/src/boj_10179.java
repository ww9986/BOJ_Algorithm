import java.io.*;

public class boj_10179 { // 쿠폰
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++)
            bufferedWriter.write("$" + String.format("%.2f",Double.parseDouble(bufferedReader.readLine()) * 0.8) + "\n");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}