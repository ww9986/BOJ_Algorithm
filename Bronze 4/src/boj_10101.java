import java.io.*;

public class boj_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a == b && b == c)
            bufferedWriter.write("Equilateral");
        else if (a + b + c == 180) {
            if (a == b || b == c || a == c)
                bufferedWriter.write("Isosceles");
            else
                bufferedWriter.write("Scalene");
        }
        else
            bufferedWriter.write("Error");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
