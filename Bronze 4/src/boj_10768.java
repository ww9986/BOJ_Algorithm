import java.io.*;

public class boj_10768 { // 특별한 날
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(bufferedReader.readLine());
        int day = Integer.parseInt(bufferedReader.readLine());

        if(2<month)
            bufferedWriter.write("After");
        else if (month<2)
            bufferedWriter.write("Before");
        else{
         if(day<18)
             bufferedWriter.write("Before");
         else if(18<day)
             bufferedWriter.write("After");
         else
             bufferedWriter.write("Special");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
