import java.io.*;
import java.util.StringTokenizer;

public class boj_10797 { // 10부제
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(bufferedReader.readLine()), count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < 5; i++){
            if(day%10 == Integer.parseInt(stringTokenizer.nextToken()))
                count++;
        }

        bufferedWriter.write(String.valueOf(count));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
