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
public class Punto {
    private double x; 
    private double y;
    
    public Punto(double x, double y){       
        this.x= x;
        this.y= y;
    }    
        
public double getX()
{
    return this.x;
}       

public void setX(double x)
{
    this.x = x;
}

public double getY()
{
    return this.y;
}       

public void setY(double y)
{
    this.y = y;
}

public String toString()
{
    return "Los ejes del punto son " + this.x + " y " + this.y + "\n";
}
    
public void Desplazar(double dx, double dy){
    x= this.x + dx;
    y= this.y + dy;    
}
public double Distancia (Punto p){

    double distancia = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    return  distancia;
}
        
    
}