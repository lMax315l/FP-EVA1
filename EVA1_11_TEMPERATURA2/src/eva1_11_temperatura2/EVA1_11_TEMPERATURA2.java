/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kelvin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Fahrenheit");
        far = captu.nextDouble();
        temp = (far - 32) / 1.8;
        kelvin = (far - 32) * 5/9.0 + 273.15;
        System.out.println(far + "°F = " + temp + "°C");
        System.out.println(far + "°F = " + kelvin + "°K");
    }
    
}
