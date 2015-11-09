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
public class Segmento {
    private Punto p1;
    private Punto p2;
    private double resultado;
    
    public Segmento(Punto p1, Punto p2){
        this.p1= p1;
        this.p2= p2;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Segmento{" + "p1=" + this.p1 + ", p2=" + this.p2 + '}';
    }
               
    public void DesplazarSeg(double dx, double dy){
        this.p1.Desplazar(dx, dy);
        this.p2.Desplazar(dx, dy);
    }  

    public double LongitudSeg(){
        this.resultado= this.p1.Distancia(this.p2);
        return this.resultado;
    }  
    
    public void Escalar(double n){
        double ex = this.p1.getX() *n;
        double ey = this.p1.getY() *n;        
    }
    

}