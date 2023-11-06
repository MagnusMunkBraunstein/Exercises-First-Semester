package RegnvejrToDIMArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Rainfall {
    public static void main(String[] args) throws IOException {
        int[][] data = new int [11][12];

        FileReader fil = new FileReader("RainfallData.txt");
        BufferedReader ind = new BufferedReader(fil);
        String linje = ind.readLine();
        int r = 0;
        while (linje != null)


        {
            String[] bidder = linje.split(" ");
            for (int c = 0; c<=11; c++) {
                data[r][c]=Integer.parseInt(bidder[c]);
            }

            linje = ind.readLine();
            r++;
        }
        fil.close();

        data[2][3]=10000;
    }
}
