/*
 14. Elabore un algoritmo que lea los siguientes datos para N vendedores:
No. De vendedor, Venta, Zona de venta. Imprima la comisión para cada 
vendedor de acuerdo con la siguiente tabla:

Zona de Venta	         Comisión
Norte	                 20 %
Sur	                 18 %
Oriente	                 17 %
Poniente	         21 %
Centro	                 15 %

 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Vendedores_Comision {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         String[] nombre = new String[51];
          String[] Norte = new String[370];
          String[] Sur = new String[370];
         String[] Oriente = new String[370];
         String[] Poniente = new String[370];
         String[] Centro = new String[370];
         String[] zventa = new String[370];
        int[] venta = new int[51];
        double[] porcentaje = new double[51];
        double[] comision = new double[51];
        Scanner preg = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner vent = new Scanner(System.in);
        Scanner zven = new Scanner(System.in);
        System.out.println("Ingrese el numero de vendedores: ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Ingrese el nombre del vendedor #" + i);
            String nombr = nom.nextLine();
            nombre[i] = nombr;
            System.out.println("Ingrese la venta de " + nombre[i]);
            int ven = vent.nextInt();
            venta[i] = ven;
            System.out.println("Ingrese la zona de venta de " + nombre[i]);
            String zvent = zven.nextLine();
            zventa[i] = zvent;
            if (zventa == Norte) {
                porcentaje[i] = 20/100;
                comision[i] = porcentaje[i]*venta[i];
            } else if (zventa == Sur) {
                porcentaje[i] = 18/100;
                comision[i] = porcentaje[i]*venta[i];
            } else if (zventa == Oriente) {
                porcentaje[i] = 17/100;
                comision[i] = porcentaje[i]*venta[i];
            } else if (zventa == Poniente) {
                porcentaje[i] = 21/100;
                comision[i] = porcentaje[i]*venta[i];
            } else if (zventa == Centro) {
                porcentaje[i] = 15/10;
                comision[i] = porcentaje[i]*venta[i];
            }
        }
        for (i = 1; i <= prgn; i++) {
        System.out.println("La venta de " + nombre[i] + " es de " + venta[i] 
                + " en zona " + zventa[i] + " y su comision es de "
                + comision[i]);
        }
    }
}
