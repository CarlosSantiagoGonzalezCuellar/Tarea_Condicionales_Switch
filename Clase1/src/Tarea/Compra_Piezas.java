/*
11.Una empresa quiere hacer una compra de varias piezas de la misma clase
a una fábrica de refacciones. La empresa, dependiendo del monto total de
la compra, decidirá qué hacer para pagar al fabricante.
•Si el monto total de la compra excede de $500.000 la empresa tendrá la 
capacidad de invertir de su propio dinero un 55% del monto de la compra, 
pedir prestado al banco un 30% y el resto lo pagará solicitando un crédito
al fabricante.
•Si el monto total de la compra no excede de $500.000 la empresa tendrá 
capacidad de invertir de su propio dinero un 70% y el restante 30% lo pagará
solicitando crédito al fabricante.
•El fabricante cobra por concepto de intereses un 20% sobre la cantidad 
que se le pague a crédito.

 */
package Tarea;

import java.util.Scanner;

/**
 *Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */

public class Compra_Piezas {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int piezas;
         double costo, total, invertir, prestamo, credito, interes;
         System.out.println("Ingrese numero de piezas: ");
         piezas = input.nextInt();
         System.out.println("Ingrese costo por pieza: ");
         costo = input.nextInt();
         total=piezas*costo;
         
         if(total>5000){
             invertir=total*0.55; 
             prestamo=total*0.30;
             credito=total*0.15;
         }
         else{
              invertir=total*0.70; 
             prestamo=total*0;
             credito=total*0.30;
             }
         
         interes=credito*0.20;
         
         System.out.println("Cantidad a invertir: "+invertir);
         System.out.println("Cantidad a prestamo: "+prestamo);
         System.out.println("Cantidad a credito: "+credito);
         System.out.println("Interes: "+interes);
         }
  
}
