import java.io.*;

public class boj_14065 { // Gorivo

    final static  double MileToMeter = 1609.344;
    final static  double GallonToLitre = 3.785411784 ;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        double mile = Double.parseDouble(bufferedReader.readLine());

        bufferedWriter.write(String.format("%.6f",100000/(MileToMeter*mile)*GallonToLitre));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
