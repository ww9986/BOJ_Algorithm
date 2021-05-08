import java.io.*;

public class boj_6763 { // Speed fines are not fine!
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(bufferedReader.readLine());
        int speed = Integer.parseInt(bufferedReader.readLine());

        if(speed-limit>0) {
            if(speed-limit<21)
                bufferedWriter.write("You are speeding and your fine is $100.");
            else if(speed-limit<31)
                bufferedWriter.write("You are speeding and your fine is $270.");
            else
                bufferedWriter.write("You are speeding and your fine is $500.");
        }
        else
            bufferedWriter.write("Congratulations, you are within the speed limit!");

        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
