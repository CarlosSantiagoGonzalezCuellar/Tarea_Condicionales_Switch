/*
 2. En una serviteca se ha establecido una promoción de las llantas marca
“Pinchadas”, dicha promoción consiste en lo siguiente:
•Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75
si se compran de cinco a 10 y de U$50 si se compran más de 10.
•Obtener la cantidad de dinero que una persona tiene que pagar por cada una
de las llantas que compra y la que tiene que pagar por el total de la compra.

 */
package Tarea;

import java.util.Scanner;

/**
 *Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Promocion_Llantas {
    
    public static void main(String[] args){
         final int PRECIO=100;
         Scanner input = new Scanner (System.in);
         int cantllantas=0;
         double vrllanta, vrpagar, precio;
        
         System.out.print("Numero de llantas a comprar: ");
         cantllantas=input.nextInt();
         if(cantllantas<5){
             precio=100; 
         }
         else{
             if(cantllantas<10){
                 precio=75;
             }
             else{
                 precio=50;
             }
         }
        
         vrpagar=precio*cantllantas;
         System.out.println("Cant. llantas=     "+cantllantas);
         System.out.println("Vr. llanta=   "+precio);
         System.out.println("Vr. Pagar=    "+vrpagar);
           
    } 
    
}
