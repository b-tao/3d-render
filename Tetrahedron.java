import java.awt.Color;
import java.awt.Graphics;

public class Tetrahedron {
    private MyPolygon[] polygons;
    private Color color;
    
    public Tetrahedron(Color color, MyPolygon... polygons){
        this.color = color;
        this.polygons = polygons;
        //this.setPolygonColor();
    }

    public void render(Graphics g){
        for(MyPolygon poly : this.polygons){
            poly.render(g);
        }
    }

    public void rotate(boolean CW, double Xdegrees, double YDegrees, double ZDegrees){
        for (MyPolygon p : this.polygons){
            p.rotate(CW, Xdegrees, YDegrees, ZDegrees);
        }
        this.sortPolygons();
    }

    private void sortPolygons(){
        MyPolygon.sortPolygons(this.polygons);
    }
    private void setPolygonColor(){
        for(MyPolygon poly : this.polygons){
            poly.setColor(this.color);
        }
    }
}
