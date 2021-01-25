/*
 4. La casa del adulto mayor tiene 37 personas registradas y requiere un reporte
 de los adultos con más de 85 años Para ello implementa un sistema en el que
 se capturan el nombre y la edad de cada persona e imprime los datos de
  quienes cumplen con la condición solicitada.
 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Reporte_Adultos {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String[] nombres = new String[370];
        int[] edades = new int[370];
        Scanner ed = new Scanner(System.in);
        Scanner pre = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        System.out.println("Ingrese cuantas personas nuevas quiere agregar: ");
        int num = pre.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            System.out.println("Ingrese el nombre de la persona #" + i);
            String nombr = nom.nextLine();
            nombres[i] = nombr;
            System.out.println("Ingrese la edad de " + nombres[i]);
            int edd = ed.nextInt();
            edades[i] = edd;
        }
        for (i = 1; i <= num; i++) {
            if (edades[i] > 85) {
                System.out.println(nombres[i] + " es mayor de 85 años");
            }
        }
    
    }
}
