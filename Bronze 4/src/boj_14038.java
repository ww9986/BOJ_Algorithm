import java.io.*;

public class boj_14038 { // Tournament Selection
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (bufferedReader.readLine().equals("W"))
                count++;
        }

        switch (count) {
            case 5, 6 -> bufferedWriter.write("1");
            case 3, 4 -> bufferedWriter.write("2");
            case 1, 2 -> bufferedWriter.write("3");
            default -> bufferedWriter.write("-1");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
