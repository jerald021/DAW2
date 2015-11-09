/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw2;

/**
 *
 * @author jerald021
 */
public class Rectangulo2 implements interfazRectangulo {
    private Segmento s1;
    private Segmento s2;

    
    public Rectangulo2(Segmento s1, Segmento s2){
        this.s1= s1;
        this.s2= s2;               
    }

    public Segmento getS1() {
        return s1;
    }

    public void setS1(Segmento s1) {
        this.s1 = s1;
    }

    public Segmento getS2() {
        return s2;
    }

    public void setS2(Segmento s2) {
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "Rectangulo2{" + "s1=" + s1 + ", s2=" + s2 + '}';
    }

    @Override
    public double area() {
        double a1 = s1.LongitudSeg();
        double a2 = s2.LongitudSeg();
        return a1 * a2;
    }

    @Override
    public double perimetro() {
        double ls1 = s1.LongitudSeg();
        double ls2 = s2.LongitudSeg();
        return (2 * ls1) + (2 * ls2);        
    }               

    @Override
    public void escalar(double n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}