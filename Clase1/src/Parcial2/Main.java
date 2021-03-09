/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Main {
     public static void main(String[] args) {
         
 
        Informacion a = new Informacion();
         
        Inmobiliaria b;
         
        //Añado Inmuebles (un poco de todo)
        for(int i=0;i<10;i++){
            switch(i%2){
                case 0:
                    b=new Casas();
                    a.agregarInmueble(b);
                    break;
                case 1:
                    b=new Apartamentos();
                    a.agregarInmueble(b);
                    break;
            }
        }
         
        //Muestro lps Inmuebles
        a.mostrarInmuebles();
         
        //Calculo el precio de todos los Inmuebles
        System.out.println("Precio de todas las bebidas "+a.calcularPrecioInmueble());
         
        //Elimino un Inmueble en concreto
        a.eliminarInmueble(4);
         
        //Muestro los Inmuebles
        a.mostrarInmuebles();
         
        //
        System.out.println("Precio de todos los inmuebles"
                +a.calcularPrecioInmueble());
         
        System.out.println("Precio de todas los inmuebles segun estrato" 
                +a.calcularPrecioInmueble());
         
        System.out.println("Calcular el precio por ancho 0: "
                +a.calcularPrecioInmueble(0));
         
    }
     
}

