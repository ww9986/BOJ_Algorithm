import java.io.*;
import java.util.StringTokenizer;

public class boj_6764 { // Sounds fishy!
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] fish = new int[4];

        for (int i = 0; i < 4; i++)
            fish[i] = Integer.parseInt(bufferedReader.readLine());

        if (fish[0] < fish[1] && fish[1] < fish[2] && fish[2] < fish[3])
            bufferedWriter.write("Fish Rising");
        else if (fish[0] > fish[1] && fish[1] > fish[2] && fish[2] > fish[3])
            bufferedWriter.write("Fish Diving");
        else if (fish[0] == fish[1] && fish[1] == fish[2] && fish[2] == fish[3])
            bufferedWriter.write("Fish At Constant Depth");
        else
            bufferedWriter.write("No Fish");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
