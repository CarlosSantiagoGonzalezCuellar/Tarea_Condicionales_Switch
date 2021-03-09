/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
* Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Alarma_Principal extends Alarma {
    public static void main(String args[]){
        SensorSwing sensor = new SensorSwing();
        Timbre timbre = new Timbre();
        Alarma alarma = new Alarma(sensor, timbre, 0.0);
        
        sensor.serAlarma(alarma);
        
    }
}
