import java.io.*;
import java.util.StringTokenizer;

public class boj_14173 { // Square Pasture
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer dot1 = new StringTokenizer(bufferedReader.readLine());
        StringTokenizer dot2 = new StringTokenizer(bufferedReader.readLine());

        int[] quadrilateral1 = new int[4];
        int[] quadrilateral2 = new int[4];

        for(int i = 0; i < 4; i++){
            quadrilateral1[i] = Integer.parseInt(dot1.nextToken());
            quadrilateral2[i] = Integer.parseInt(dot2.nextToken());
        }

        int ans1 = Math.max(quadrilateral2[2],quadrilateral1[2])-Math.min(quadrilateral2[0],quadrilateral1[0]);
        int ans2 = Math.max(quadrilateral2[3],quadrilateral1[3])-Math.min(quadrilateral1[1],quadrilateral2[1]);

        bufferedWriter.write(String.valueOf((int) Math.pow(Math.max(ans1,ans2),2)));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
