import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Studentlist2 {
    public static void main(String[] arg) throws IOException
    {
        FileReader fil = new FileReader("StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<Student> list=new ArrayList<Student>();

        String linje = ind.readLine();
        while (linje != null)

        {
            String[] bidder = linje.split(",");
            Student s = new Student();
            s.id= bidder[0].substring(0,8);
            s.Fornavn = bidder[1];
            s.Efternavn = bidder[2];
            list.add(s);
            linje = ind.readLine();
        }
        fil.close();
        list.sort(null);
        for (Student s: list){
            System.out.println(s);
        }
        SaveList(list);
    }
    static void SaveList(ArrayList<Student> l ) throws IOException {
        FileWriter fil = new FileWriter("src\\StudentListSorted");
        PrintWriter ud = new PrintWriter(fil);
        for (Student s : l) {
            ud.println(s);

        }
        fil.close();
    }
}//start



class Student implements Comparable<Student> {
    String Fornavn;
    String Efternavn;
    String id;

@Override
    public  String toString(){
        return id+" "+Fornavn+" "+Efternavn;
    }
    @Override
    public int compareTo(Student o){
    return id.compareTo(o.id);
    }
}


//System.out.println(bidder[0]);
//System.out.println(bidder[1]);
//System.out.println(bidder[2]);
