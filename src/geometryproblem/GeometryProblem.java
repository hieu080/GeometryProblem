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
public class GeometryProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 5);
        Point pointC = new Point(5, 5);
        Point pointD = new Point(5, 0);
        
        Line lineAB = new Line(pointA, pointB);
        Line lineBC = new Line(pointB, pointC);
        Line lineCD = new Line(pointC, pointD);
        Line lineDA = new Line(pointD, pointA);
        
        Square square1 = new Square(lineAB);
        System.out.println("Perimeter of Square 1 = " + square1.getPerimeter() + "\n" + "Area of Square 1 = " + square1.getArea());
        
        Point pointE = new Point(7, 0);
        
        Line lineCE = new Line(pointC, pointE);
        Line lineEA = new Line(pointE, pointA);
        
        Trapezoid trapezoid1 = new Trapezoid(lineAB, lineBC, lineCE, lineEA);
        System.out.println("Perimeter of Trapezoid 1 = " + trapezoid1.getPerimeter() + "\n" + "Area of Trapezoid 1 = " + trapezoid1.getArea());
    }
    
}
