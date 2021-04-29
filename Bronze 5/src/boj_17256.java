import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_17256 { // 달달함이 넘쳐 흘러
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < 3; i++)
            a[i] = Integer.parseInt(stringTokenizer.nextToken());

        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < 3; i++)
            c[i] = Integer.parseInt(stringTokenizer1.nextToken());

        b[0] = c[0] - a[2];
        b[1] = c[1] / a[1];
        b[2] = c[2] - a[0];

        for (int num : b)
            System.out.print(num + " ");
    }
}
