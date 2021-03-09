/*
 Cree una clase denominada Alarma cuyos objetos activen un objeto de tipo 
Timbre cuando el valor medido por un Sensor supere un umbral preestablecido:
Implemente en Java todo el código necesario para el funcionamiento de la 
alarma, suponiendo que la alarma comprueba si debe activar o desactivar el
timbre cuando se invoca el método comprobar().
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Alarma {
    private Sensor sensor;
    private Timbre timbre;
    private double umbral;
    
    //Constructor
    
    public Alarma
            (Sensor sensor, Timbre timbre, double umbral){
                this.sensor=sensor;
                this.timbre=timbre;
                this.umbral=umbral;
            }
     //Comprobar estado de la alarma
            
            public void Comprobar (){
           if(sensor.getValorActual()>umbral){
               timbre.activar();
           }else{
                timbre.desactivar();
           }
}
}
