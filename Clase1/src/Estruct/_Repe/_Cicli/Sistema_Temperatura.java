/*
3. El sistema meteorológico local requiere un sistema para capturar 
la temperatura promedio de cada día de la semana e imprimir el nombre 
del día y un mensaje de la percepción de la temperatura de acuerdo con
el valor capturado según la siguiente tabla:

Temperatura	                    Mensaje
Menor o igual que cero	            Congelante
1 a 10°C	                    Muy frío
11 a 20°C	                    Frío
21 a 24°C	                    Templado
25 a 29°C	                    Agradable
30 a 35°C	                    Caliente
36°C o más	                    Muy caliente

 */
package Estruct._Repe._Cicli;
import java.util.Scanner; 

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Sistema_Temperatura {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         String[] dia = new String[51];
        int[] temperatura = new int[51];
        double[] comision = new double[51];
        Scanner preg = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        Scanner temp = new Scanner(System.in);
        System.out.println("Ingrese el numero de dias de la semana"
                + " que quiere registrar (Limite: 7): ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Ingrese el dia #" + i);
            String di = day.nextLine();
            dia[i] = di;
            System.out.println("Ingrese la temperatura del " + dia[i]);
            int tem = temp.nextInt();
            temperatura[i] = tem;
            if (tem <= 0) {
                System.out.println("El dia " + dia[i] + " esta: Congelante");
            } else if (tem <= 0) {
                System.out.println("El dia " + dia[i] + " esta: Muy frio");
            } else if (tem >= 11 && tem <= 20) {
                System.out.println("El dia " + dia[i] + " esta: Frio");
            } else if (tem >= 21 && tem <= 24) {
                System.out.println("El dia " + dia[i] + " esta: Templado");
            } else if (tem >= 25 && tem <= 29) {
                System.out.println("El dia " + dia[i] + " esta: Agradable");
            } else if (tem >= 30 && tem <= 35) {
                System.out.println("El dia " + dia[i] + " esta: Caliente");
            } else if (tem >=36) {
                System.out.println("El dia " + dia[i] + " esta: Muy caliente");
        }
       
    }
    }
}

