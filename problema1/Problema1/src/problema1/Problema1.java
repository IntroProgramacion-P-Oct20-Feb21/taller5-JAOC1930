/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double vKilovatios;
        double kConsumidos;
        double total;
        int edad;
        double porcentaje = 10;
        double descuento;
        System.out.println("Ingresar el costo de kilovatios por hora");
        vKilovatios= entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos al mes");
        kConsumidos= entrada.nextDouble();
        System.out.println("Ingrese edad");
        edad= entrada.nextInt();
        total= vKilovatios * kConsumidos;
        if(edad >5){
            descuento= (porcentaje*total)/100;
            total= total - descuento;
        }
        System.out.println("El valor total a pagar es:" +total);
        
        
        
    }
    
}
