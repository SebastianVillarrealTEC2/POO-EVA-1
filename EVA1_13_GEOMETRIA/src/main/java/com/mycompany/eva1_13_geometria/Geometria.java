/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_13_geometria;

/**
 *
 * @author bisonte
 */
public class Geometria {
    public static double Cuadradoarea(double lado){
        double resu;
        resu = (lado * lado);
        return resu;
    }
    public static double Cuadradoperimetro(double peri){
        double resu;
        resu = (4 * peri);
        return resu;
    }
    public static double Rectanguloarea(double base, double altura){
        double resu;
        resu= base * altura;
        return resu;
    }
    public static double Rectanguperimetro(double base, double altura){
        double resu;
        resu= 2*base + 2*altura;
        return resu;
    }
      public static double Trianguloarea(double base, double altura){
        double resu;
        resu = (base * altura) /2;
        return resu;
    }
      public static double Trianguloperimetro(double L1, double L2, double L3){
        double resu;
        resu = L1+L2+L3;
        return resu;
    }
    public static double Circuloarea(double radio){
        double resu;
        resu =  3.1416 * (radio * radio);
        return resu;
    }
    public static double Circuloperimetro(double diagonal){
        double resu;
        resu= 3.1416* diagonal;
        return resu;
    }
    public static double Romboarea (double Dmayor, double dmenor){
         double resu;
        resu =  (Dmayor*dmenor)/2;
        return resu;
    }
    
    public static double Trapecioarea(double basemayor, double basemenor, double altura){
        double resu;
        resu= (basemayor + basemenor) * altura /2 ;
        return resu;
    }
    
}
