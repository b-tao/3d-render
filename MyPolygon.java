
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPolygon {

    private Color color;
    private MyPoint[] points;

    public MyPolygon(Color color, MyPoint... points){
        this.color = color;
        this.points = new MyPoint[points.length];
        for (int i = 0;i<points.length;i++){
            MyPoint p = points[i];
            this.points[i] = new MyPoint(p.x, p.y, p.z);
        }
    }

    public void render(Graphics g){
        Polygon poly = new Polygon();
        for (int i = 0; i<this.points.length;i++){
            Point p = PointConverter.convertPoint(this.points[i]);
            poly.addPoint(p.x, p.y);
        }
        g.setColor(color);
        g.fillPolygon(poly);
    }

    public void rotate(boolean CW, double Xdegrees, double YDegrees, double ZDegrees){
        for(MyPoint p : points){
            PointConverter.rotateAxisX(p, CW, Xdegrees);
            PointConverter.rotateAxisY(p, CW, YDegrees);
            PointConverter.rotateAxisZ(p, CW, ZDegrees);
        }
    }

    public double getAverageX(){
        double sum = 0;
        for(MyPoint p : this.points){
            sum += p.x;
        }
        return sum / this.points.length;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public static MyPolygon[] sortPolygons(MyPolygon[] polygons){
        List<MyPolygon> polygonsList = new ArrayList<MyPolygon>();

        for(MyPolygon poly : polygons){
            polygonsList.add(poly);
        }

        Collections.sort(polygonsList, new Comparator<MyPolygon>() {
            @Override
            public int compare(MyPolygon p1, MyPolygon p2){
                return  p2.getAverageX() - p1.getAverageX() < 0 ? 1 : -1;
            }
        });

        for (int i =0; i<polygons.length; i++){
            polygons[i] = polygonsList.get(i);
        }
        return polygons;
    }

}
