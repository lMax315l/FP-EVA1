/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {
    static final double PI = 3.1416; //constante (no cambia a diferencia de una variable)

    public static void main(String[] args) {
        double per, ar, vol, rad;
        Scanner captu = new Scanner(System.in);
        
        rad = captu.nextDouble();
        per = (2 * PI * rad);
        ar = PI * (rad * rad);
        vol = 4/3.0 * PI * (rad * rad * rad);
       
        System.out.println("Perimetro: " + per + "cm");
        System.out.println("Area: " + ar + "cm");
        System.out.println("Volumen: " + vol + "cm");
                
        
    }
    
}
