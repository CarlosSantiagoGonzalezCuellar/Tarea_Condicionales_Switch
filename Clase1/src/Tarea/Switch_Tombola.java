/*
 12.Un supermercado realiza una tómbola con todos los clientes, si son hombres
tienen que sacar de una canasta una bolita la cual tiene un número grabado y
si son mujeres lo mismo pero de otra canasta, los premios se dan bajo
la siguiente tabla:	

HOMBRES				        MUJERES
# Bolita		Premio		# bolita		Premio
1		Desodorante		1		Loción
2		Six-Pack de cerveza	2		Bikini
3		Camiseta		3		Crema para la cara
4		Pantaloneta		4		Plancha para el cabello
5		Sudadera		5		Esmalte de uñas	


 */
package Tarea;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Switch_Tombola {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sexo, f=2, m=1, bolita;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite su sexo (1.Maculino-2.Femenino): ");
        sexo=input.nextInt();
        System.out.println("Elije una bolita del 1 al 5 de la tombola: ");
        bolita=input.nextInt();
        
        if(sexo==1){
        switch(bolita){
            case 1:
                System.out.println("Desodorante");
                break;
            case 2:
                System.out.println("Six-Pack de cerveza");
                break;
            case 3:
                System.out.println("Camiseta");
                break;
            case 4:
                System.out.println("Pantaloneta");
                break;
            case 5: 
                System.out.println("Sudadera");
                break;
            default:
                System.out.println("Opcion equivocada...");}
 }
        else if(sexo==2){
        switch(bolita){
            case 1:
                System.out.println("Loción");
                break;
            case 2:
                System.out.println("Bikini");
                break;
            case 3:
                System.out.println("Crema para la cara");
                break;
            case 4:
                System.out.println("Plancha para el cabello");
                break;
            case 5: 
                System.out.println("Esmalte de uñas");
                break;
            default:
                System.out.println("Opcion equivocada...");
           }

       }
        
    }
}
    

