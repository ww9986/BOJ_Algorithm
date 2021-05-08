import java.io.*;

public class boj_11948 { // 과목 선택
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int physical = Integer.parseInt(bufferedReader.readLine());
        int chemistry = Integer.parseInt(bufferedReader.readLine());
        int creature = Integer.parseInt(bufferedReader.readLine());
        int geoSciences = Integer.parseInt(bufferedReader.readLine());
        int history = Integer.parseInt(bufferedReader.readLine());
        int geography = Integer.parseInt(bufferedReader.readLine());

        bufferedWriter.write(String.valueOf(physical + chemistry + creature + geoSciences - Math.min(Math.min(physical, chemistry), Math.min(creature, geoSciences)) + Math.max(history, geography)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
