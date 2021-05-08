import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2530 { // 인공지능 시계
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int hours = Integer.parseInt(stringTokenizer.nextToken());
        int minutes = Integer.parseInt(stringTokenizer.nextToken());
        int seconds = Integer.parseInt(stringTokenizer.nextToken());
        seconds += Integer.parseInt(bufferedReader.readLine());

        if (59 < seconds) {
            minutes += seconds / 60;
            seconds %= 60;
        }
        if (59 < minutes) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (23 < hours)
            hours %= 24;

        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
