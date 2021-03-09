/*
Esta es la parte ejecutable de la clase Cuenta_Abs
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Cuenta_Abs_Ejecutable  {
    public static void main(String[] args) {
         
        Cuenta_Abs cuenta_1 = new Cuenta_Abs("DiscoDurodeRoer");
        Cuenta_Abs cuenta_2 = new Cuenta_Abs("Fernando", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
         
    }
     
}
