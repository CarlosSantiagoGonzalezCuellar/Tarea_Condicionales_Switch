/*
 5.El dueño de una empresa desea planificar las decisiones financieras que
tomara en el siguiente año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo
bancario para que su nuevo saldo sea de U$10.000. Si su capital tiene 
actualmente un saldo positivo pedirá un préstamo bancario para tener un 
nuevo saldo de U$20.000, pero si su capital tiene actualmente un saldo
superior a los U$20.000 no pedirá ningún préstamo. 
Posteriormente repartirá su presupuesto de la siguiente manera:
•	U$5.000 para equipo de computo
•	U$2.000 para mobiliario
•	El resto la mitad será para la compra de insumos y la otra para 
otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e 
incentivos al personal.

 */
package Tarea;
import java.util.Scanner;

/**
 *Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Decisiones_Financieras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double presu, saldo, total;
        System.out.println("Ingrese el capital de la empresa: ");
        saldo=input.nextInt();
        
        if (saldo<0)
        {
            saldo=10000;
        }
        
        else{
            if(saldo<20000){
                saldo=20000;
            }
            
            total=saldo-7000;
            total=total/2;
            
            System.out.println("El dinero para la compra de insumos es "+total);
            System.out.println("El dinero para los incentivos"
                    + " de insumos es "+total);    
        }
    }
}
