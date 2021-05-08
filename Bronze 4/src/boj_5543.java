import java.io.*;

public class boj_5543 { // 상근 날드
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int sangdeok = Integer.parseInt(bufferedReader.readLine());
        int jungdeok = Integer.parseInt(bufferedReader.readLine());
        int hadeok = Integer.parseInt(bufferedReader.readLine());
        int coke = Integer.parseInt(bufferedReader.readLine());
        int cider = Integer.parseInt(bufferedReader.readLine());

        int sangdeokSet = sangdeok + Math.min(coke, cider) - 50;
        int jungdeokSet = jungdeok + Math.min(coke, cider) - 50;
        int hadeokSet = hadeok + Math.min(coke, cider) - 50;

        bufferedWriter.write(String.valueOf(Math.min(Math.min(sangdeokSet, jungdeokSet), hadeokSet)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
