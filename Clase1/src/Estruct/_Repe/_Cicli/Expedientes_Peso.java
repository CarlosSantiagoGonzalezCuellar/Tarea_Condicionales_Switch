/*
8. Un centro de salud cuenta con 1270 expedientes en su archivo 
y desea identificar a las personas con mayor y menor peso. Para ello 
implementa un sistema mediante el cual se capturan el nombre y peso de
cada paciente y al finalizar, se imprime el nombre y kgs. de las
personas con mayor y menor peso.
 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Expedientes_Peso {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner pre = new Scanner(System.in);
         Scanner nom = new Scanner(System.in);
         String[] nombres = new String[370];
          int[] peso = new int[370];
        Scanner pe = new Scanner(System.in);
      
       Scanner teclado = new Scanner (System.in);
       System.out.println("Ingrese cuantas personas nuevas quiere agregar: ");
        int num = pre.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            System.out.println("Ingrese el nombre de la persona #" + i);
            String nombr = nom.nextLine();
            nombres[i] = nombr;
            System.out.println("Ingrese el peso de " + nombres[i]);
            int pes = pe.nextInt();
            peso[i] = pes;
        }
       for (i = 1; i <= num; i++) {
            if (peso[i] > 80) {
                System.out.println(nombres[i] + " pesa " + peso[i] + "kgs" + 
                        " :es de mayor peso");
            }else if (peso[i]<30){
                System.out.println(nombres[i] + " pesa " + peso[i] + "kgs" + 
                        " :es de menor peso");
            }
        }
    }
}
