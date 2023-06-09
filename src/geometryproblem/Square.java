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
public class Square extends Quadrilateral {

    public Square(Line side) {
        super(side, side, side, side);
    }
    
    public double getArea() {
        double sideLength = getSide1().getLength();
        double area = sideLength * sideLength;
        return area;
    }
}
