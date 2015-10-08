/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw2;

/**
 *
 * @author jerald
 */
public class Cuadrado extends Figura{
    protected double ancho;
    
    public Cuadrado(Punto origen, double ancho){
        super.Figura(origen);
        this.ancho = ancho;
    }  
    
    public double getAncho(){
        return this.ancho;
    }

    public Punto getOrigen(){
        return origen;
    }

    public void setOrigen(Punto origen){
        this.origen = origen;
    }
      
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    
    @Override public String toString(){
        return "Cuadrado " + this.ancho;
    }
        
    
    @Override
    public double area() {
        return Math.pow(this.ancho, 2);
    }

    @Override
    public double perimetro() {
        return this.ancho * 4;
    }

    @Override
    public void escalar(double n) {
        this.ancho *=n;
    }

    
}
