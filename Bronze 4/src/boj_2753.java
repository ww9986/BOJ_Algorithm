import java.io.*;

public class boj_2753 { // 윤년
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write((year % 4 == 0) &&(year % 100 != 0) || (year % 400 == 0) ? "1" : "0");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}