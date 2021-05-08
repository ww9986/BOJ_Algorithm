import java.io.*;
import java.util.StringTokenizer;

public class boJ_5575 { // 타임 카드
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer employA = new StringTokenizer(bufferedReader.readLine(), " ");

        int workA = Integer.parseInt(employA.nextToken()) * 3600 + Integer.parseInt(employA.nextToken()) * 60 + Integer.parseInt(employA.nextToken());
        int Off_workA = Integer.parseInt(employA.nextToken()) * 3600 + Integer.parseInt(employA.nextToken()) * 60 + Integer.parseInt(employA.nextToken());

        StringTokenizer employB = new StringTokenizer(bufferedReader.readLine(), " ");

        int workB = Integer.parseInt(employB.nextToken()) * 3600 + Integer.parseInt(employB.nextToken()) * 60 + Integer.parseInt(employB.nextToken());
        int Off_workB = Integer.parseInt(employB.nextToken()) * 3600 + Integer.parseInt(employB.nextToken()) * 60 + Integer.parseInt(employB.nextToken());

        StringTokenizer employC = new StringTokenizer(bufferedReader.readLine(), " ");

        int workC = Integer.parseInt(employC.nextToken()) * 3600 + Integer.parseInt(employC.nextToken()) * 60 + Integer.parseInt(employC.nextToken());
        int Off_workC = Integer.parseInt(employC.nextToken()) * 3600 + Integer.parseInt(employC.nextToken()) * 60 + Integer.parseInt(employC.nextToken());

        int a = Off_workA - workA;
        int b = Off_workB - workB;
        int c = Off_workC - workC;

        bufferedWriter.write(a / 3600 + " " + a % 3600 / 60 + " " + a % 60 + "\n");
        bufferedWriter.write(b / 3600 + " " + b % 3600 / 60 + " " + b % 60 + "\n");
        bufferedWriter.write(c / 3600 + " " + c % 3600 / 60 + " " + c % 60 + "\n");
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
