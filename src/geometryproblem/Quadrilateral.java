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
public class Quadrilateral {
    private Line side1;
    private Line side2;
    private Line side3;
    private Line side4;
    
    public Quadrilateral(Line side1, Line side2, Line side3, Line side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
    
    public double getPerimeter() {
        double perimeter = side1.getLength() + side2.getLength() + side3.getLength() + side4.getLength();
        return perimeter;
    }

    public Line getSide1() {
        return side1;
    }

    public void setSide1(Line side1) {
        this.side1 = side1;
    }

    public Line getSide2() {
        return side2;
    }

    public void setSide2(Line side2) {
        this.side2 = side2;
    }

    public Line getSide3() {
        return side3;
    }

    public void setSide3(Line side3) {
        this.side3 = side3;
    }

    public Line getSide4() {
        return side4;
    }

    public void setSide4(Line side4) {
        this.side4 = side4;
    }
    
    
}
