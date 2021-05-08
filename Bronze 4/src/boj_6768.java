import java.io.*;

public class boj_6768 { // Don’t pass me the ball!
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n  = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf((n-1)*(n-2)*(n-3)/6));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
