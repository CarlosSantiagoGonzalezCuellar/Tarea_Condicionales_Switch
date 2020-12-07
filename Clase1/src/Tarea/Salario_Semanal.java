/*
 10.Un obrero necesita calcular su salario semanal, el cual se obtiene
de la siguiente manera:
•Si trabaja 40 horas o menos se le paga $5000 por hora
•Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras
40 horas y un aumento del 20% por cada hora extra.

 */
package Tarea;

import java.util.Scanner;

/**
 *Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Salario_Semanal {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    float ss;
int ht, he;
System.out.println("Ingresa Horas Trabajadas:");
ht = input.nextInt();
if (ht > 40)
{
//calculamos las horas extras
he = ht - 40;
//calculamos el salario semanal
ss = he * 1000 + 40 * 5000;
}
else
{
//calculamos el salario semanal del caso contrario
ss = ht * 5000;
}
//mostramos el salario semanal
System.out.println("El Salario Semanal es : "+ss);

}
}
