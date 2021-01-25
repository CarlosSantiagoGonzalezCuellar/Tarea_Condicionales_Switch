/*
 6. Una empresa distribuidora de huevos cuenta con N repartidores, 
los cuales al final de su jornada laboral, entregan un reporte con la venta 
realizada. Implemente un ciclo para capturar el nombre y la venta (en dinero)
de cada repartidor y al final muestre el nombre y la venta de los 
repartidores con mayor y menor monto.
 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Distribuidora_Huevos {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner pre = new Scanner(System.in);
         Scanner nom = new Scanner(System.in);
         String[] nombres = new String[370];
          int[] vent = new int[370];
        Scanner ven = new Scanner(System.in);
      
       Scanner teclado = new Scanner (System.in);
       System.out.println("Ingrese el numero de repartidores: ");
        int num = pre.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            System.out.println("Ingrese el nombre del repartidor #" + i);
            String nombr = nom.nextLine();
            nombres[i] = nombr;
            System.out.println("Ingrese la venta de " + nombres[i]);
            int venta = ven.nextInt();
            vent[i] = venta;
        }
       for (i = 1; i <= num; i++) {
            if (vent[i] > 60000) {
                System.out.println(nombres[i] + " hizo una venta de " 
                        + vent[i] + "$" + 
                        " :Es de mayor monto");
            }else if (vent[i]<15000){
                System.out.println(nombres[i] + " hizo una venta de " 
                        + vent[i] + "$" + 
                        " :Es de menor monto");
            }
            else{
                System.out.println(nombres[i] + " hizo una venta de " 
                        + vent[i] + "$" + 
                        " :Es de un monto normal");
            }
        }
     }
}
