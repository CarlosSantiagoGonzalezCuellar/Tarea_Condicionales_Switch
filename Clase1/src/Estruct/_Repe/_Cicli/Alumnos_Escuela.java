/*
 12. Leer los siguientes datos de los alumnos de una escuela: 
Número de control, Nivel, Especialidad. Calcular lo siguiente:

a) Cuántos alumnos son de bachillerato
b) Cuántos alumnos son de profesional
c) Cuántos alumnos son de maestría
d) Cuántos alumnos son de sistemas

 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 
 * @author santiago cuellar
 */
public class Alumnos_Escuela {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         String[] nombre = new String[51];
          String[] bachillerato = new String[370];
          String[] profesional = new String[370];
         String[] maestria = new String[370];
         String[] sistemas = new String[370];
         String[] nivel = new String[370];
         String[] especialidad = new String[370];
        int[] control = new int[51];
        int alumbach, alumpro, alummae, alumsis;
          alumbach=0;
          alumpro=0;
          alummae=0;
          alumsis=0;
        Scanner preg = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner cont = new Scanner(System.in);
        Scanner niv = new Scanner(System.in);
        Scanner espe = new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Ingrese el nombre del alumno #" + i);
            String nombr = nom.nextLine();
            nombre[i] = nombr;
            System.out.println("Ingrese el numero de control de " + nombre[i]);
            int con = cont.nextInt();
            control[i] = con;
            System.out.println("Ingrese el nivel de " + nombre[i] + 
                    " (Junior,Semi senior, Senior): ");
            String ni = niv.nextLine();
            nivel[i] = ni;
            System.out.println("Ingrese la especialidad de " + nombre[i] 
                    + " (bachillerato, profesional, maestria, sistemas): ");
            String esp = espe.nextLine();
            especialidad[i] = esp;
            for (i = 1; i <= prgn; i++) {
             if (especialidad==bachillerato) {
                alumbach++;
            } else if (especialidad==profesional){
            	alumpro++;
            } else if (especialidad==maestria){
            	alummae++;
            } else if (especialidad==sistemas){
            	alumsis++;
            }
        }
        System.out.println("Son alumnos de bachillerato: ");
        System.out.println(alumbach);
        System.out.println("Son alumnos de profesional: ");
        System.out.println(alumpro);
        System.out.println("Son alumnos de maestria: ");
        System.out.println(alummae);
        System.out.println("Son alumnos de sistemas: ");
        System.out.println(alumsis);
        }
    }
}
