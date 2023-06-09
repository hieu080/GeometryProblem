/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryproblem;

/**
 *
 * @author HELLO
 */
public class Trapezoid extends Quadrilateral {
    
    private double height;
    
    public Trapezoid(Line side1, Line side2, Line side3, Line side4) {
        super(side1, side2, side3, side4);
        getHeight();
    }
    
    public double getArea() {
        double sumOfBases = getSide1().getLength() + getSide2().getLength();
        double area = 0.5 * sumOfBases * height;
        return area;
    }
    
    private void getHeight() {
        double base1Length = getSide1().getLength();
        double base2Length = getSide2().getLength();
        double verticalDistance = getSide3().getLength();
        height = Math.sqrt(verticalDistance * verticalDistance - Math.pow((base1Length - base2Length) / 2, 2));
    }
}
