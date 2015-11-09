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
        Punto p1= new Punto(5, 10);         
        Punto p2 = new Punto (10, 20);
        Punto p3= new Punto(20, 40);         
        Punto p4 = new Punto (30, 80);
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
        
        
//        Circulo cc1= new Circulo(p1, 50);   
//        System.out.println(cc1);
//        cc1.numFiguras();
//
//        System.out.println("area " + cc1.area());
//        
//        Triangulo t1 = new Triangulo(p1, 5, 3);
//        t1.numFiguras();
//
//        System.out.println(t1);
//        System.out.println("perimetro " + t1.perimetro());
//        
//        Rectangulo r1 = new Rectangulo(p1, 10, 5);
//        System.out.println(r1);
//
//        r1.escalar(5);
//        System.out.println(r1);
//
//        r1.numFiguras();
//        System.out.println("Hay " + cc1.numFiguras() + " figuras");
//        
//        Segmento s1 = new Segmento(p1, p2);
//        System.out.println(s1);
        
        Segmento s1 = new Segmento(p1, p2);
        Segmento s2 = new Segmento(p3, p4);
//        System.out.println(s1);
//        System.out.println(s2);
        
        Rectangulo2 r1 = new Rectangulo2(s1,s2);
        System.out.println(r1);
        
//        System.out.println(r1.area());
//        System.out.println(r1.perimetro());
        r1.escalar(10);
        System.out.println(r1);      
        
//        
////        s1.DesplazarSeg(10, 5);
////        System.out.println(s1);       
//        System.out.println(s1.LongitudSeg());        
    }
       
}