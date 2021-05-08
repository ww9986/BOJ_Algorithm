import java.io.*;

public class boj_6778 { // Which Alien?
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int antenna = Integer.parseInt(bufferedReader.readLine());
        int eye = Integer.parseInt(bufferedReader.readLine());

        if (2 < antenna && eye < 5)
            bufferedWriter.write("TroyMartian\n");
        if (antenna < 7 && 1 < eye)
            bufferedWriter.write("VladSaturnian\n");
        if (antenna < 3 && eye < 4)
            bufferedWriter.write("GraemeMercurian\n");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}