import java.io.*;

public class boJ_10162 { // 전자레인지

    final static int buttonA = 300;
    final static int buttonB = 60;
    final static int buttonC = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine());

        if (0 < t % buttonC)
            bufferedWriter.write("-1");
        else {
            bufferedWriter.write(t / buttonA + " ");
            t %= buttonA;

            bufferedWriter.write(t / buttonB + " ");
            t %= buttonB;

            bufferedWriter.write(t / buttonC + " ");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
