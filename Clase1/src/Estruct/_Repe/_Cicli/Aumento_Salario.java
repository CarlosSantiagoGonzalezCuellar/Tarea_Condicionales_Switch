/*
 9. Una compañía ha tenido un excelente año y desea premiar a sus
empleados con un aumento de salarios. Los sueldos deben ajustarse
a la siguiente forma:

Sueldo actual	      Aumento
Hasta $9,000	      20 %
$9,001 - $13,000      17 %
$13,001 - $ 18,000    12 %
Sobre $18,000	      6 %

La compañía tiene 50 empleados. Diseñe un algoritmo en diagrama de
flujo que lea el nombre de cada empleado y su sueldo actual, y que 
imprima el nombre, el sueldo actual y el sueldo aumentado. Al final
de la lista debe proporcionar también, el monto total de la nómina actual
y el monto total de la nueva nómina que incluye los aumentos mencionados.

 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 *
 * @author santiago cuellar
 */
public class Aumento_Salario {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String[] nombre = new String[51];
        int[] salact = new int[51];
        double[] aum = new double[51];
        double nomsin = 0, nomcon = 0;
        Scanner preg = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner sal = new Scanner(System.in);
        System.out.println("Ingrese cuantos empleados quiere revisar"
                + " (Limite: 50): ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Ingrese el nombre del empleado #" + i);
            String nombr = nom.nextLine();
            nombre[i] = nombr;
            System.out.println("Ingrese el sueldo actual de " + nombre[i]);
            int sala = sal.nextInt();
            salact[i] = sala;
            nomsin = salact[i] + nomsin;
            if (salact[i] <= 9000) {
                aum[i] = (0.20 * salact[i]) / 100;
                nomcon = aum[i] + nomcon;
            } else if (salact[i] >= 9001 && salact[i] <= 13000) {
                aum[i] = (0.17 * salact[i]) / 100;
                nomcon = aum[i] + nomcon;
            } else if (salact[i] >= 13001 && salact[i] <= 18000) {
                aum[i] = (0.12 * salact[i]) / 100;
                nomcon = aum[i] + nomcon;
            } else if (salact[i] > 18000) {
                aum[i] = (0.06 * salact[i]) / 100;
                nomcon = aum[i] + nomcon;
            }
        }
        for (i = 1; i <= prgn; i++) {
            System.out.println("El sueldo actual de " + nombre[i] + 
                    " es de " + salact[i] + " y su sueldo aumentado es de " 
                    + (salact[i]+aum[i]));
        }
        System.out.println("\n\n\n");
        System.out.println("La nomina sin los sueldos aumentados "
                + "es de: " + nomsin);
        System.out.println("Y la nomina con los aumentos es de: "
                + (nomsin+nomcon));
     }
}
