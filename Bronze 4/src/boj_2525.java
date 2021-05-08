import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2525 { // 오분 시계
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minutes = Integer.parseInt(stringTokenizer.nextToken());
        minutes += Integer.parseInt(bufferedReader.readLine());

        if (59 < minutes) {
            hour += minutes / 60;
            minutes %= 60;
        }
        if (23 < hour)
            hour -= 24;

        System.out.println(hour + " " + minutes);
    }
}
