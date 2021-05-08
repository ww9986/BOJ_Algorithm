import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj_1212 { // 8진수 2진수
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String str = bufferedReader.readLine();
        int len = str.length();
        boolean first = true;

        if (len == 1 && str.charAt(0) == '0') {
            System.out.print(0);
        }
        for (int i=0; i<len; i++) {
            int n = str.charAt(i) - '0';
            if (first && n < 4) {
                if (n == 0) {
                    continue;
                } else if (n == 1) {
                    System.out.print("1");
                } else if (n == 2) {
                    System.out.print("10");
                } else if (n == 3) {
                    System.out.print("11");
                }
                first = false;
            } else {
                System.out.print(eight[n]);
                first = false;
            }
        }
        System.out.println();
    }
}
