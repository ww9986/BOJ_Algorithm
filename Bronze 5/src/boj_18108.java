import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_18108 { // 1998년생인 내가 태국에서는 2541년생?!
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(n-543);
    }
}
