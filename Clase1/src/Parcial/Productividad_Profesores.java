/*
Ejercicio No. 1:
El Ministerio de Educación y el ICFES desean evaluar anualmente 
la productividad de los profesores de cada una de las universidades públicas. 
La evaluación se basa en informes presentados por cada profesor en los que
indica su nombre y el promedio de horas trabajadas por semana académica
durante el año. Se clasifica cada profesor según esa información, y cada
universidad también recibe una clasificación. La clasificación de la
productividad de los profesores se calcula de la manera siguiente:
• A los profesores que en promedio trabajan más de 36 horas semanales se
les considera “muy productivos”.
• Si trabajan entre 30 y 36 horas inclusive durante una semana, se les
considera “satisfactorios”.
• Si trabajan menos de 30 horas semanales se les considera “remunerados en
exceso”.
La evaluación de la productividad de cada universidad se determina
calculando el índice siguiente: Sumatoria de Horas promedio trabajadas 
por semana por todos los profesores/ Número de profesores que entregan informes
Si el índice es mayor a 18, la universidad es clasificada como tipo “A”, 
de lo contrario es tipo “B”.
Se necesita un programa en para:
a) Imprimir nombre y clasificación de cada profesor.
b) Imprimir la clasificación de cada universidad.
c) Calcular el porcentaje de universidades donde más del 50% de los profesores
son muy productivos.
 */
package Parcial;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 
 * @author santiago cuellar
 */
public class Productividad_Profesores {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         String[] nombre = new String[51];
          String[] universidad = new String[51];
        int[] horassem = new int[51];
        double[] comision = new double[51];
        Scanner preg = new Scanner(System.in);
        Scanner nomb = new Scanner(System.in);
        Scanner univ = new Scanner(System.in);
        Scanner hrssem = new Scanner(System.in);
        int indice=0;
        System.out.println("Ingrese el numero de profesores: ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Ingrese el nombre del profesor #" + i);
            String nom = nomb.nextLine();
            nombre[i] = nom;
            System.out.println("Ingrese las horas trabajadas por"
                    + " semana académica durante el año de " + nombre[i]);
            int hs = hrssem.nextInt();
            horassem[i] = hs;
            hs++;
            if (hs > 36) {
                System.out.println(nombre[i] + " Es muy productivo");
            } else if (hs >= 30 && hs <= 36) {
                System.out.println(nombre[i] + " Es satisfactorio");
            } else if (hs < 30) {
                System.out.println(nombre[i] + " Es renumerado en exceso");
            } 
            System.out.println("Ingrese la universidad a la que pertenece "
            + nombre[i]);
            String un = univ.nextLine();
            universidad[i] = un;
            indice=hs/prgn;
            if (indice > 18) {
                System.out.println(universidad[i] + " Es tipo A");
            } else if (indice < 18) {
                System.out.println(universidad[i] + " Es tipo B");
            } 
            } 
      
        }
       
    }
    

