/*
 1.En una fábrica de computadoras se planea ofrecer a los clientes
un descuento que dependerá del número de computadoras que compre. Si las 
computadoras son menos de cinco se les dará un 10% de descuento sobre el 
total de la compra; si el número de computadoras es mayor o igual a cinco
pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se
les da un 40% de descuento. El precio de cada computadora es de U$500
 */
package Tarea;

import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Ventas_PC {
     
    public static void main(String[] args){
         final int PRECIO=500;
         Scanner input = new Scanner (System.in);
         int cantpc=0;
         double vrcompra, vrdto, vrpagar, dto;
        
         System.out.print("Numero de PC a comprar: ");
         cantpc=input.nextInt();
         if(cantpc<5){
             dto=10; 
         }
         else{
             if(cantpc<10){
                 dto=20;
             }
             else{
                 dto=40;
             }
         }
        
         vrcompra=PRECIO*cantpc;
         vrdto=vrcompra*dto/100;
         vrpagar=vrcompra-vrdto;
         System.out.println("Cant. PC=     "+cantpc);
         System.out.println("Vr. Compra=   "+vrcompra);
         System.out.println("Vr. Descuento="+vrdto);
         System.out.println("Vr. Pagar=    "+vrpagar);
           
    } 
   
}
