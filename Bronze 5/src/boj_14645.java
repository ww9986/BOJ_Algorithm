import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14645 { // 와이버스 부릉부릉
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < n; i++)
            bufferedReader.readLine();

        System.out.println("비와이");
    }
}
