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

    public Trapezoid(Line side1, Line side2, Line side3, Line side4) {
        super(side1, side2, side3, side4);
    }

    public double getArea() {
        double a = getSide2().getLength();
        double b = getSide1().getLength();
        double c = getSide4().getLength();
        double d = getSide3().getLength();
        
        double area = ((c + a) * Math.sqrt(Math.pow(d, 2) - Math.pow(((Math.pow(b - c, 2) + Math.pow(d, 2) - Math.pow(a, 2)) / (2 * (b - c))), 2))) / 2;
        return area;
    }
}

