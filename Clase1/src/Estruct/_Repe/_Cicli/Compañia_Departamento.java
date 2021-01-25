/*
13. Leer los siguientes datos de los empleados de una compañía: 
Nombre, Sueldo, Departamento. Calcule lo siguiente:

a) Cuántos empleados hay en cada departamento.
b) Cuántos empleados ganan más de $ 8,000

Existen 5 departamentos: Finanzas, Sistemas, Producción,
Ventas y Mantenimiento. Considere las claves necesarias.

 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Compañia_Departamento {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner pre = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner sue = new Scanner(System.in);
        Scanner dep = new Scanner(System.in);
        String[] depr = new String[1000];
        String[] nomb = new String[1000];
        int[] sueld = new int[1000];
        int i, mayor = 0, sis = 0, fin = 0, pro = 0, ven = 0, man = 0;
        System.out.println("Digite el numero de empleados a preguntar");
        int prg = pre.nextInt();
        for (i = 1; i <= prg; i++) {
            System.out.println("Digite el nombre del empleado #" + i + ": ");
            String name = nom.nextLine();
            nomb[i] = name;
            System.out.println("Digite el sueldo de " + nomb[i] + ": ");
            int suel = sue.nextInt();
            sueld[i] = suel;
            if (sueld[i] > 8000) {
                mayor++;
            }
            System.out.println("Digite el departamento de " + nomb[i] + ": ");
            String depa = dep.nextLine();
            depr[i] = depa;
            if (depr[i].equals("finanzas")||depr[i].equals("Finanzas")
                    ||depr[i].equals("FINANZAS")) {
                fin++;
            } else if (depr[i].equals("sistemas")||depr[i].equals("Sistemas")
                    ||depr[i].equals("SISTEMAS")) {
                sis++;
            } else if (depr[i].equals("produccion")||depr[i].equals
        ("Produccion")||depr[i].equals("PRODUCCION")) {
                pro++;
            } else if (depr[i].equals("ventas")||depr[i].equals("Ventas")
                    ||depr[i].equals("VENTAS")) {
                ven++;
            } else if (depr[i].equals("mantenimiento")||depr[i].equals
        ("Mantenimiento")||depr[i].equals("MANTENIMIENTO")) {
                man++;
            } else {
                System.out.println("Caracter erroneo!");
            }
        }
        System.out.println("\n\n\n");
        System.out.println("Los empleados que ganan mas de 8000 son:");
        System.out.println(mayor);
        System.out.println("Los empleados de Finanzas son: "+fin);
        System.out.println("Los empleados de sistemas son: "+sis);
        System.out.println("Los empleados de produccion son: "+pro);
        System.out.println("Los empleados de ventas son: "+ven);
        System.out.println("Los empleados de mantenimiento son: "+man);
        for(i=1;i<=prg;i++)
        {

        }
    }
}
