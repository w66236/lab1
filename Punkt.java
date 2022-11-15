package WsizLab5;

//pkt2
public class Punkt {
    public double x, y; //pkt 2

    //pkt 3
    public Punkt() {
        this.x = 0.0;
        this.y = 0.0;
    }

    //pkt 4
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //pkt 5
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj() {x = 0.0; y = 0.0;}

    public void opis(){System.out.println("Pkt. o wsp. [x,y] = "+x+", "+y);}

    public void przesun(double x, double y){this.x+=x;this.y+=y;}

}

