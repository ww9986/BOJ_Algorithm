import java.io.*;

public class boj_14264 { // 정육각형과 삼각형
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        double l = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf( l * l * Math.sqrt(3) / 4));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}