import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj_6749 { // Next in line
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        int youngest = Integer.parseInt(bufferedReader.readLine());
        int middle_children = Integer.parseInt(bufferedReader.readLine());

        System.out.println(middle_children + (middle_children - youngest));
    }
}
