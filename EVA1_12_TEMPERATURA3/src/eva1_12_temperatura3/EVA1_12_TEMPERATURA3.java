/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura3;

import java.util.Scanner;

/**
 *
 * @author Jose Ortega
 */
public class EVA1_12_TEMPERATURA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Kelvin");
        kelvin = captu.nextDouble();
        temp = (kelvin - 273.15);
        far = (kelvin - 273.15) * 1.8 + 32;
        System.out.println(kelvin + "°K = " + temp + "°C");
        System.out.println(kelvin + "°K = " + far + "°F");
    }
    
}
