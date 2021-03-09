/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Principal {
     public static void main(String[] args) {
        
        //Creamos el objeto
        Universidad aula=new Universidad();
         
        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
        }
         
    }
     
}
