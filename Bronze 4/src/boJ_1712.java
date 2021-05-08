import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boJ_1712 { // 손익분기점
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int fixedCost = Integer.parseInt(stringTokenizer.nextToken());
        int variableCost = Integer.parseInt(stringTokenizer.nextToken());
        int price = Integer.parseInt(stringTokenizer.nextToken());

        if (price <= variableCost)
            System.out.println(-1);
        else
            System.out.println(fixedCost / (price - variableCost) + 1);
    }
}
