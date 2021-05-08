import java.io.*;
import java.util.StringTokenizer;

public class boj_11549 { // Identifying tea
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < 5; i++){
            if(answer == Integer.parseInt(stringTokenizer.nextToken()))
                count++;
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
