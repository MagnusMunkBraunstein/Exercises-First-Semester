package points;

import java.awt.*;

public class Points {
    int x1;
    int x2;

    int y1;
    int y2;

    Points(int X1, int X2, int Y1, int Y2) {
        x1 = X1;
        x2 = X2;

        y2 = Y1;
        y2 = Y2;
    }

    public static void main(String[] args) {
        double dis;
        Point p1 = new Point(10, 2);
        Point p2 = new Point(4, 7);
        Point p3 = new Point(1, -3);

        dis = Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
        System.out.println("Længden af linjen mellem punkt 1 og 2 er " + dis);

    }
}
