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
public class Triangulo extends Figura{
    private int base;
    private int altura;
    
    public Triangulo (Punto Origen, int base, int altura){
        super(Origen);
        this.base = base;
        this.altura = altura;
    }   
    

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public Punto getOrigen() {
        return origen;
    }
    

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Triangulo " + "base= " + base + " y la altura= " + altura;
    }
    
    
    @Override
    public double area() {
        return  this.base * this.altura / 2;
    }


    @Override
    public double perimetro() {
        return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.base / 2, 2)) * 2 + this.base;
    }

    @Override
    public void escalar(double n) {
        this.base*= n; 
        this.altura*= n; 
    }  
    
    
}
