import java.io.*;

public class boJ14470 { // 전자레인지
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        int e = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for (int i = a; a <= b; i++) {
            if (i < 0)
                result += c;
            else if (i > 0)
                result += e;
            else
                result += d;
        }

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
