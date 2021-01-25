/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author santiago cuellar
 */
public class Multa {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reg, cuad, lim_vel, vel_real, multa;
        int ninf1=0, ninf2=0, ninf3=0, ninf4=0, ninf=1;
        int acmul1=0, acmul2=0, acmul3=0, acmul4=0;
        float promul1, promul2, promul3, promul4;
        boolean fin=false;
        
        while(fin==false){
            System.out.println("No. infraccion: "+ninf);
            System.out.println("No. reg. vehiculo: ");
            reg=input.nextInt();
            System.out.println("Cuadrante: ");
            cuad=input.nextInt();
            System.out.println("Limite velocidad: ");
            lim_vel=input.nextInt();
            System.out.println("Velocidad real: ");
            vel_real=input.nextInt();
            multa=50+(vel_real-lim_vel)*20;
            System.out.println("Registro  Vel. Reg  Vel. Limite  Multa");
            System.out.println(reg+"  "+vel_real+"  "+lim_vel+"  "+multa);
            
            switch(cuad){
                case 1:
                    ninf1++;
                    
                            
            }
        }
        
        

    }

    
}
