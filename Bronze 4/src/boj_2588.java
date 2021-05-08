import java.io.*;

public class boj_2588 { // 곱셈
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out));

        int a = Integer.parseInt(bufferedReader.readLine());
        String b = bufferedReader.readLine();

        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println((a * (b.charAt(2) - '0'))+(a * (b.charAt(1) - '0')*10)+(a * (b.charAt(0) - '0')*100));
    }
}
