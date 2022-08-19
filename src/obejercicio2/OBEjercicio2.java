/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obejercicio2;

import java.util.Scanner;


public class OBEjercicio2 {


    public static void main(String[] args) {
        int precio;
         Scanner leer = new Scanner(System.in);
        System.out.println("Indique el precio del producto: ");
        precio = leer.nextInt();
        
       
        
        
        precioIva(precio);
        
    }

    private static void precioIva(int precio) {
        
        double precioIva = precio + precio *0.21;
        
        System.out.println("el precio del producto con IVA es de: " + precioIva);
        
        
        
    }
    
}
