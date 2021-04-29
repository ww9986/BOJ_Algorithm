import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_15727 { // 조별과제를 하려는데 조장이 사라졌다.
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int l = Integer.parseInt(bufferedReader.readLine());

        System.out.println((l % 5) == 0 ? l / 5 : l / 5 + 1);
    }
}
