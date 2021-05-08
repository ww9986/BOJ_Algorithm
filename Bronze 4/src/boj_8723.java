import java.io.*;
import java.util.*;

public class boj_8723 { // Patyki
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] len = {Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())};
        Arrays.sort(len);

        if (Math.pow(len[0], 2) + Math.pow(len[1], 2) == Math.pow(len[2], 2))
            bufferedWriter.write("1\n");
        else if (len[0] == len[1] && len[1] == len[2])
            bufferedWriter.write("2\n");
        else
            bufferedWriter.write("0\n");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
