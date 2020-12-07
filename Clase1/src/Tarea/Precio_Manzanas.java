/*
 4.Una frutería ofrece las manzanas con descuento según la siguiente tabla:
		NUM. DE KILOS COMPRADOS		% DESCUENTO
	        0      -   2		        0%
		2.01 -   5 		        10%
		5.01 - 10		        15%
		10.01 en adelante	        20%

Determinar cuánto pagara una persona que compre manzanas es esa frutería.

 */
package Tarea;

import java.util.Scanner;

/**
 *Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Precio_Manzanas {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int kg;
        double desc = 0, total, pu;
        
        System.out.println("Ingrese precio de unidad del KG de Manzana: ");
        pu=input.nextInt();
        System.out.println("¿Cuantos Kg. ha comprado?: ");
        kg=input.nextInt();
        if (kg > 0 && kg <= 2) {
            desc = 0;
        } else if (kg > 2 && kg <= 5) {
            desc = 0.1;
        } else if (kg > 5 && kg <= 10) {
            desc = 0.15;
        } else if (kg > 10) {
            desc = 0.2;
        }
        total = (pu * kg) - ((pu * kg) * desc);
        System.out.println("Total a pagar: " + total);
    }
}
