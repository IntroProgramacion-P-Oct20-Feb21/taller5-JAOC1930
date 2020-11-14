/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double cantidad;
        double precioUni;
        double total;
        double porcentaje= 15;
        double descuento;
        System.out.println("Ingrese canidad solicitada");
        cantidad= entrada.nextDouble();
        System.out.println("Ingrese el precio unitario del producto");
        precioUni= entrada.nextDouble();
        total = cantidad * precioUni;
        if(cantidad>50){
            descuento= (total * porcentaje);
            total= total * descuento;
        }
        System.out.println("El valor a pagar es:" +total);
        
        
        
        
    }
    
}
