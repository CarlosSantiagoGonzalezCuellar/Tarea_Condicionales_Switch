/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author santiago cuellar
 */
public class TestComplejo {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complejo c1 = new Complejo(1,1);
        Complejo c2 = new Complejo(2,2);
        Complejo c3=c1.suma(c2);
        System.out.println(c3.toString());
        Complejo c4=c1.suma(c1,c2);
        System.out.println(c4.toString());
    }
}
