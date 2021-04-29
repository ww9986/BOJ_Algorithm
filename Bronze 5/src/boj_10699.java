import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class boj_10699 { // 오늘 날짜, 오늘 날짜는?
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        System.out.print("문제 번호를 입력하세요 > ");
        int ID = Integer.parseInt(bufferedReader.readLine());

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");

        Date time = new Date();

        if (ID == 10699) {
            String time1 = format1.format(time);
            System.out.println(time1);
        }
        else if(ID == 16170){
            String yearTime = year.format(time);
            String monthTime = month.format(time);
            String dayTime = day.format(time);

            System.out.println(yearTime);
            System.out.println(monthTime);
            System.out.println(dayTime);
        }
    }
}
