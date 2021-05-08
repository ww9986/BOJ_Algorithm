import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2752 { // 세수정렬
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] nums = new int[3];

        for (int i = 0; i < 3; i++)
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());

        Arrays.sort(nums);

        for (int num : nums)
            bufferedWriter.write(num + " ");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedWriter.close();
    }
}