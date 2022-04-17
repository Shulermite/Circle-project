package circleapp;
import za.ac.wsu.s221771247.Circle;
/**
 * @version 1.0
 * @author Lunghile Mabasa
 * @studentNo 221771247
 */

public class CircleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle((float) 2.5, 3, 1);
        System.out.println(c1.toString());
        System.out.println("Area : " + c1.calculateArea());
        System.out.println("Circumference : " + c1.calculateCircumference());
        System.out.println("Diameter : " + c1.calculateDiameter() + "\n");
        
        Circle c2 = new Circle((float) 9.0, 4, 6);
        System.out.println(c2.toString());
        System.out.println("Area : " + c2.calculateArea());
        System.out.println("Circumference : " + c2.calculateCircumference());
        System.out.println("Diameter : " + c2.calculateDiameter() + "\n");
        
        Circle c3 = new Circle((float) -4.5, 2, 4);
        System.out.println(c3.toString());
        System.out.println("Area : " + c3.calculateArea());
        System.out.println("Circumference : " + c3.calculateCircumference());
        System.out.println("Diameter : " + c3.calculateDiameter() + "\n\n");
    }
    
}
