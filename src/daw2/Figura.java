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
public abstract class Figura {    
    protected Punto origen;
    private static int numFiguras= 0;
    
    public void Figura(Punto origen){
        this.origen = origen;
        Figura.numFiguras++;
    }    
    
    public void Desplazar(int dx, int dy){
        this.origen.Desplazar(dx, dy);
    }
    
    @Override
    public String toString(){
        return this.origen.toString();
    }   
    
    public static int numFiguras(){
        return Figura.numFiguras;
    }    
    
    public double distancia(Figura f){
        return this.origen.Distancia(f.origen);
    }
        
    
    public abstract double area();
    public abstract double perimetro();
    public abstract void escalar(double n);
}