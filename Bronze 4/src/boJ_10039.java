import java.io.*;

public class boJ_10039 { // 평균 점수
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 0, sum = 0;
        while (n < 5) {
            sum += Math.max(Integer.parseInt(bufferedReader.readLine()), 40);
            n++;
        }

        bufferedWriter.write(String.valueOf(sum / 5));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}