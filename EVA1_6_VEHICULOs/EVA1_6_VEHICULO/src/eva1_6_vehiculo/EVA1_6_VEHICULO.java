/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int ano;
        String color;
        int km;
        double precio;
        Scanner capt = new Scanner(System.in);
        
        System.out.println("Captura La Marca:");
        marca = capt.nextLine();
        System.out.println("Captura el Modelo:");
        modelo = capt.nextLine();
        System.out.println("Captura el Año:");
        ano = capt.nextInt();
        System.out.println("Captura el Color:");
        color = capt.nextLine();
        capt.nextLine();
        System.out.println("Captura el kilometraje:");
        km = capt.nextInt();
        System.out.println("Captura el precio:");
        precio = capt.nextDouble();
        
        System.out.println("Datos Capturados:");
        System.out.print("Marca:");
        System.out.println(marca);
        System.out.print("Modelo:");
        System.out.println(modelo);
        System.out.print("Año:");
        System.out.println(ano);
        System.out.print("Color:");
        System.out.println(color);
        System.out.print("Kilometraje:");
        System.out.println(km);
        System.out.print("Precio:");
        System.out.println(precio);
        
        
    }
    
}
