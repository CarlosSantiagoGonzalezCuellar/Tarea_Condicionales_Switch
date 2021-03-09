/*
  * Para cambiar este encabezado de licencia, elija Encabezados de licencia
en Propiedades del proyecto.
* Para cambiar este archivo de plantilla, elija Herramientas | Plantillas
 * y abra la plantilla en el editor.
 */
package POO;
import  java.util.Scanner ;
/**
 *Carlos Santiago Gonzalez Cuellar - 20201186835
 * @author santiago cuellar
 */
public class Test { 
    public  static  void  main ( String [] args ) {
        Scanner input = new Scanner(System.in);
        
        Bicicleta miBicicleta=new Bicicleta(20,42,13);
        Bicicleta tuBicicleta=new Bicicleta(10,24,36);
        System.out.println(miBicicleta.toString());
        System.out.println(tuBicicleta.toString());
        miBicicleta.acelerar();
        System.out.println(miBicicleta.toString());
        miBicicleta.frenar();
        System.out.println(miBicicleta.toString());
        miBicicleta.cambiarPlato(34);
        miBicicleta.cambiarPiñon(24);
        System.out.println(miBicicleta.toString());
        miBicicleta.setVelocidadActual(18);
        System.out.println(miBicicleta.toString());
        miBicicleta.setPlatoActual(0);
        System.out.println(miBicicleta.toString());
        
        
        
        
    }
    
}

