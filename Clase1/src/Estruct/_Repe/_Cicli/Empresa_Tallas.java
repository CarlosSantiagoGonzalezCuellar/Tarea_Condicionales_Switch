/*
 7. Una empresa desea comprarles camisas a sus empleados y para 
ello requiere un sistema para capturar el nombre y la talla de cada uno.
Las tallas disponibles son XS, S, M, L, XL, XXL y XXXL (valide con un 
ciclo do-while la captura de la talla). El sistema debe imprimir el nombre
del empleado, la talla de su camisa y la cantidad de camisas de cada talla.
 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Empresa_Tallas {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner nom = new Scanner(System.in);
        Scanner tal = new Scanner(System.in);
        Scanner tot = new Scanner(System.in);
        System.out.println("Digite el total de empleados: ");
        int totl = tot.nextInt();
        String[] tall = new String[1000];
        String[] nombrs = new String[1000];
        int i = 1, exit = 0, xs = 0, s = 0, m = 0, l = 0, xl = 0, xxl = 0, 
                xxxl = 0;
        do {
            System.out.println("Digite el nombre del empleado #" + i);
            String name = nom.nextLine();
            nombrs[i] = name;
            System.out.println("Las tallas disponibles son XS, S, M, L, XL, "
                    + "XXL y XXXL");
            System.out.println("Digite la talla de " + nombrs[i] + ": ");
            String talla = tal.nextLine();
            tall[i] = talla;
            do {
                switch (tall[i]) {
                    case "XS":
                        xs++;
                        exit++;
                        break;
                    case "S":
                        s++;
                        exit++;
                        break;
                    case "M":
                        m++;
                        exit++;
                        break;
                    case "L":
                        l++;
                        exit++;
                        break;
                    case "XL":
                        xl++;
                        exit++;
                        break;
                    case "XXL":
                        xxl++;
                        exit++;
                        break;
                    case "XXXL":
                        xxxl++;
                        exit++;
                        break;
                    default:
                        System.out.println("Caracter erroneo");
                        break;
                }
            } while (exit == 0);
            i++;
        } while (i <= totl);
        System.out.println("\n\n\n");
        for (i = 1; i <= totl; i++) {
            System.out.println("El empleado " + nombrs[i] + " es de talla " 
                    + tall[i]);
        }
        System.out.println("\n\n\n");
        System.out.println("Las camisetas pedidas XS son: " + xs);
        System.out.println("Las camisetas pedidas S son: " + s);
        System.out.println("Las camisetas pedidas M son: " + m);
        System.out.println("Las camisetas pedidas L son: " + l);
        System.out.println("Las camisetas pedidas XL son: " + xl);
        System.out.println("Las camisetas pedidas XXL son: " + xxl);
        System.out.println("Las camisetas pedidas XXXL son: " + xxxl);
     }
}
