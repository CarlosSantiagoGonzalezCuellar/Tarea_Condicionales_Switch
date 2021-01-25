/*
 5. Un centro penitenciario tiene N internos registrados y requiere un 
reporte con el nombre y la condena (en meses) de los internos con menos
de 36 meses de condena. También debe mostrar la cantidad de internos que
cumplen con dicha condición.
 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Condena_Meses {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String[] nombres = new String[370];
        int[] condena = new int[370];
        Scanner cond = new Scanner(System.in);
        Scanner pre = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        int menorc, mayorc;
        menorc=0;
        mayorc=0;
        System.out.println("Ingrese el numero de internos: ");
        int num = pre.nextInt();
        int i;
            
           for (i=1;i<=num;i++) {
           System.out.println("Ingrese el nombre del interno #" + i);
            String nombr = nom.nextLine();
            nombres[i] = nombr;
             System.out.print("Ingrese la condena en meses de " + nombres[i]);
            int con = cond.nextInt();
            condena[i] = con;
            
            if (con<36) {
                menorc=menorc+1;
            } else {
            	mayorc=mayorc+1;
            }
        }
        System.out.print("Tienen una condena menor de 36 meses: ");
        System.out.println(menorc);
        
    
    }
     }

