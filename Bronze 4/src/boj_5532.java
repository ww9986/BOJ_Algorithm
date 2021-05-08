import java.io.*;

public class boj_5532 { // 방학 숙제
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(bufferedReader.readLine());
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        int korean = (a % c == 0) ? a / c : a / c + 1;
        int math = (b % d == 0) ? b / d : b / d + 1;

        bufferedWriter.write(String.valueOf(l-Math.max(korean,math)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
