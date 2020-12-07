/*
 13.	Una empresa automotriz necesita un sistema para seleccionar 
el tipo de carro (auto, SUV o camioneta) lo cual debe de aparecer
en un menú, y el color (negro, blanco o rojo) en otro menú.
Al final se necesita que despliegue la selección realizada. Nota. 
Debe de anidarse una estructura de selección múltiple dentro de otra.
 */
package Tarea;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Switch_Tipo_Carro {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    int auto,color ;
        System.out.println("Menu Carros");
        System.out.println("1. Auto");
        System.out.println("2. Suv");
        System.out.println("3. Camioneta");
        System.out.println("Seleccione el auto:");
        auto=input.nextInt();
        
        System.out.println("Menu Colores");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        System.out.println("Seleccione el auto:");
        color=input.nextInt();
        
        switch(auto){
            case 1:
                System.out.println("Auto");
                break;
            case 2:
                System.out.println("Suv");
                break;
            case 3:
                System.out.println("Camioneta");
                break;
            default:
                System.out.println("Opcion equivocada...");

    }
        switch(color){
            case 1:
                System.out.println("Negro");
                break;
            case 2:
                System.out.println("Blanco");
                break;
            case 3:
                System.out.println("Rojo");
                break;
            default:
                System.out.println("Opcion equivocada...");

    }
}

}
