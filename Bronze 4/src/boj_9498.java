import java.io.*;

public class boj_9498 { // 시험 성적
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(bufferedReader.readLine());

        if (89 < score)
            bufferedWriter.write("A");
        else if (79 < score)
            bufferedWriter.write("B");
        else if (69 < score)
            bufferedWriter.write("C");
        else if (59 < score)
            bufferedWriter.write("D");
        else
            bufferedWriter.write("F");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
