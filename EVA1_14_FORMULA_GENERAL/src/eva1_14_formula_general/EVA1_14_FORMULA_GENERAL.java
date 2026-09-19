/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FORMULA_GENERAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c, fgp, fgn;
        Scanner captu = new Scanner(System.in);
        System.out.println("Intruduce el dato A:");
        a = captu.nextDouble();
        System.out.println("Intruduce el dato B:");
        b = captu.nextDouble();
        System.out.println("Intruduce el dato C:");
        c = captu.nextDouble();
        
        fgp = (-1 * b + Math.sqrt(Math.pow(b, 2)-4 * a * c)) / (2.0 * a);
        fgn = (-1 * b - Math.sqrt(Math.pow(b, 2)-4 * a * c)) / (2.0 * a);
        
        System.out.println("X1 = " + fgp);
        System.out.println("X2 = " + fgn);
        
        
        
        
    }
    
}
