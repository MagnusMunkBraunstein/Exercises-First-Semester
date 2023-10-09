import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list=new ArrayList<String>();

        String linje = ind.readLine();
        while (linje != null)

        {
            String[] bidder = linje.split(",");
            String navn=bidder[1];
            list.add(navn);
            linje = ind.readLine();
        }
        fil.close();
        list.sort(null);
        for (String s: list){
            System.out.println(s);
        }
        SaveList(list);
    }
    static void SaveList(ArrayList<String> l ) throws IOException {
        FileWriter fil = new FileWriter("src\\StudentListSorted");
        PrintWriter ud = new PrintWriter(fil);
        for (String s : l) {
        ud.println(s);
        fil.close();
    }
    }
}//start
//System.out.println(bidder[0]);
//System.out.println(bidder[1]);
//System.out.println(bidder[2]);
//System.out.println(linje);
