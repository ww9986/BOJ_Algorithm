import java.io.*;

public class boj_13985 { // Equality
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] expression = bufferedReader.readLine().split(" ");

        bufferedWriter.write((Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]) == Integer.parseInt(expression[4])) ? "YES" : "NO");
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
