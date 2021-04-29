import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_15439 { // Vera and Outfits
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(n * (n - 1));
    }
}
