package za.ac.wsu.s221771247;
/**
 * @version 1.0
 * @author Lunghile Mabasa
 * @studentNo 221771247
 */
public class Circle {

    private float radius;
    private int x;
    private int y;

    public Circle() {
        this.radius = 0;
        this.x = 0;
        this.y = 0;
    }

    public Circle(float radius, int x, int y) {
        if (radius < 0) {
            System.out.println("Radius cannot be less than zero");
        } else {
            this.radius = radius;
        }
        this.x = x;
        this.y = y;
    }

    //Setters
    public void setRadius(float radius) {
        if (radius < 0) {
            System.out.println("Radius cannot be less than zero");
        } else {
            this.radius = radius;
        }
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    //Gettters
    public float getRadius() {
        return radius;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public float calculateArea() {
        return (float) ((this.radius * this.radius) * Math.PI);
    }
    
    public float calculateCircumference() {
        return (float) (2 * Math.PI * this.radius);
    }
    
    public float calculateDiameter() {
        return 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle with " + "radius = " + radius + ", x = " + x + ", y = " + y ;
    }
}
