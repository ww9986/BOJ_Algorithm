import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 단순 출력 문재
public class boj_2557_5337_5338_5339_7289_9653_9654_10170_10171_10172_10718_11942_15733_15962 { // Hello World!, 웰컴, 마이크로소프트 로고, 콜센터, 등록, 스타워즈 로고, 나부 함대 데이터, NFC West vs North, 고양이, 개, We love kriii, 고려대는 사랑입니다, 새로운 시작
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        System.out.print("문제 번호를 입력하세요 > ");
        int ID = Integer.parseInt(bufferedReader.readLine());

        if (ID == 2557)
            System.out.println("Hello World!");
        else if (ID == 5337)
            System.out.println("""
                    .  .   .
                    |  | _ | _. _ ._ _  _
                    |/\\|(/.|(_.(_)[ | )(/.""");
        else if (ID == 5338)
            System.out.println("""
                           _.-;;-._
                    '-..-'|   ||   |
                    '-..-'|_.-;;-._|
                    '-..-'|   ||   |
                    '-..-'|_.-''-._|""");
        else if (ID == 5339)
            System.out.println("""
                         /~\\
                        ( oo|
                        _\\=/_
                       /  _  \\
                      //|/.\\|\\\\
                     ||  \\ /  ||
                    ============
                    |          |
                    |          |
                    |          |""");
        else if (ID == 7282) {
            System.out.println(208);
            System.out.println("ww9986");
        } else if (ID == 9653)
            System.out.println("""
                        8888888888  888    88888
                       88     88   88 88   88  88
                        8888  88  88   88  88888
                           88 88 888888888 88   88
                    88888888  88 88     88 88    888888

                    88  88  88   888    88888    888888
                    88  88  88  88 88   88  88  88
                    88 8888 88 88   88  88888    8888
                     888  888 888888888 88  88      88
                      88  88  88     88 88   88888888""");
        else if (ID == 9654)
            System.out.println("""
                    SHIP NAME      CLASS          DEPLOYMENT IN SERVICE
                    N2 Bomber      Heavy Fighter  Limited    21       \s
                    J-Type 327     Light Combat   Unlimited  1        \s
                    NX Cruiser     Medium Fighter Limited    18       \s
                    N1 Starfighter Medium Fighter Unlimited  25       \s
                    Royal Cruiser  Light Combat   Limited    4        \s""");
        else if (ID == 10170)
            System.out.println("""
                    NFC West       W   L  T
                    -----------------------
                    Seattle        13  3  0
                    San Francisco  12  4  0
                    Arizona        10  6  0
                    St. Louis      7   9  0
                                        
                    NFC North      W   L  T
                    -----------------------
                    Green Bay      8   7  1
                    Chicago        8   8  0
                    Detroit        7   9  0
                    Minnesota      5  10  1
                    """);

        else if (ID == 10171)
            System.out.println("""
                    \\    /\\
                     )  ( ')
                    (  /  )
                     \\(__)|""");
        else if (ID == 10172)
            System.out.println("""
                    |\\_/|
                    |q p|   /}
                    ( 0 )""\"\\
                    |"^"`    |
                    ||_/=\\\\__|""");
        else if(ID == 10718)
            System.out.println("""
                    강한친구 대한육군
                    강한친구 대한육군""");
        else if(ID == 11942)
            System.out.println("고려대학교");
        else if(ID == 15733)
            System.out.println("I'm Sexy");
        else if(ID == 15962)
            System.out.println("파이팅!!");
    }
}
