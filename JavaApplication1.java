/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double F;
    double C; 
    
    System.out.println ("ingrese grados centigrados");
    Scanner D1 = new Scanner (System.in);
    C = D1.nextInt () ;
    
    F = 32+((9*C)/5);
    
    System.out.println(F);
    
    }
    
}
