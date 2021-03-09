/*
 Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad
máxima de café que puede contener la cafetera) y _cantidadActual (la 
cantidad actual de café que hay en la cafetera). Implementa, al menos, 
los siguientes métodos:
• Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.)
y la actual en cero (cafetera vacía).
• Constructor con la capacidad máxima de la cafetera; inicializa la cantidad 
actual de café igual a la capacidad máxima.
• Constructor con la capacidad máxima y la cantidad actual. Si la cantidad 
actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
• getters, setters.
• llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la
capacidad.
• servirTaza(int): simula la acción de servir una taza con la capacidad 
indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede.
• vaciarCafetera(): pone la cantidad de café actual en cero.
• agregarCafe(int): añade a la cafetera la cantidad de café indicada.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Cafetera {
   private int capacidadMaxima;
    private int cantidadActual;
    int taza;
    int relleno;
    

    
    /**
    *se aplican los Getters y Setters
    *
    */
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //se empiezan a declarar los constructores
    
    //se establece la capacidad maxima en 1000 y se inicializa la cantidad actual
    public Cafetera (){
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    //llena la cafetera a la capacidad maxima
        public Cafetera (int capacidadMaxima) {
        cantidadActual = capacidadMaxima;
        
    }


    //contiene la capacidad maxima y la actual, si la actual es superior,
        //la ajusta al maximo
    public Cafetera (int capacidadMaxima, int cantidadActual)
    {
        this.capacidadMaxima = capacidadMaxima;
       
        this.cantidadActual = (cantidadActual > capacidadMaxima)
                ? capacidadMaxima :
                                                                 
                cantidadActual;
    /*usamos el operador condicional para que si la cantidad 
        actual supera a la maxima
    *la cantidad maxima, sea la actual (adopta el valor)
    */
    }
    
    
    
    
    
    

    //empezamos a declarar los metodos
    public double llenarCafetera(){
        cantidadActual=capacidadMaxima;
        //la cantidad actual, es llenada a su capacidadMaxima
        return cantidadActual; 
    }
    
     public void servirTaza(int taza){
         

       
         
         if (taza > cantidadActual){
            
             vaciarCafetera();
         }else
         cantidadActual -= taza;
         //la cantidad actual menos la taza servida, sera el resultado 
         //de cantidadActual
        
        
    }
     
     public double vaciarCafetera(){
        cantidadActual=0;
        return cantidadActual;
        
    }
     
     public double agregarCafe(int relleno){
         
         cantidadActual += relleno;
         // se le añade a cantidadActual, la cantidad introducida
        return cantidadActual;
        
    }
 
}
