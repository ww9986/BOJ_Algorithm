import java.io.*;
import java.util.StringTokenizer;

public class boj_11466 { // Alex Origami Squares
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        double h = Double.parseDouble(stringTokenizer.nextToken());
        double w = Double.parseDouble(stringTokenizer.nextToken());
        double a = Math.max(h, w);
        double b = Math.min(h, w);

        if(a > b * 3){
            bufferedWriter.write(String.valueOf(b));
        }
        else if (a > b * 1.5){
            bufferedWriter.write(String.valueOf(a/3));
        }
        else {
            bufferedWriter.write(String.valueOf(b/2));
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
