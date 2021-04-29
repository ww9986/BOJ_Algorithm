import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boJ_1000_1001_2558 { // A+b, A-B
    public static void main(String[] args) throws IOException {
        //유사란 두 문제를 합쳤으므로 문제 ID를 받아서 ID에 맞는거로 출력하도록 한다.
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        System.out.print("문제 번호를 입력하세요 > ");
        int ID = Integer.parseInt(bufferedReader.readLine());

        System.out.println();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        if ((ID == 1000) || (ID == 2558))
            System.out.println(a + b);
        else
            System.out.println(a - b);
    }
}
