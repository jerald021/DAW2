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
public class DAW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Punto test
        Punto p1= new Punto(5, 20);         
        Punto p2 = new Punto (100, 25);
        //System.out.println(p1);
        /*
        p1.setX(10);
        p1.setY(20);
        
        p1.getX();
       //System.out.println(p1);  
       
       p1.Desplazar(50, 75);
       System.out.println(p1); 
       System.out.println(p2 + "\n");
       
       System.out.println(Math.round(p1.Distancia(p2)*100.0)/100.0 + "\n");  
        
       */
      /*Cuadrado c1= new Cuadrado(p1, 55);   
        System.out.println(c1);*/
        
        
        Circulo cc1= new Circulo(p1, 50);   
        System.out.println(cc1);
        cc1.numFiguras();

        System.out.println("area " + cc1.area());
        
        Triangulo t1 = new Triangulo(p1, 5, 3);
        t1.numFiguras();

        System.out.println(t1);
        System.out.println("perimetro " + t1.perimetro());
        
        Rectangulo r1 = new Rectangulo(p1, 10, 5);
        System.out.println(r1);

        r1.escalar(5);
        System.out.println(r1);

        r1.numFiguras();
        System.out.println("Hay " + cc1.numFiguras() + " figuras");



    }
       
}