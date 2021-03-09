/*
 Una inmobiliaria vende tres tipos de Inmuebles: Casas, Apartamentos y Locales.
Para cualquier tipo de inmueble, se conoce su dirección, el número de metros 
cuadrados, estrato y el código catastral.
Además, para los lugares de habitación (casas y apartamentos), habrá que
conocer el número de habitaciones, cantidad de baños, tipo de cocina, y 
si está en conjunto cerrado. Para las casas hay que conocer también si 
tiene patio o jardín y el número de piso.
Para los locales importaría el número de ventanas que tenga y si está en
un centro comercial.
Además, cualquiera de estos inmuebles puede ser nuevo o de segunda mano.
El precio de cada inmueble se calcula a partir de un precio base y una 
serie de características: para cualquier inmueble, si tiene menos de 15
años, su precio se rebaja un 1 %, mientras que si tiene más se reduce un 2 %.
En el caso de las viviendas de habitación, si esta en conjunto cerrado,
su precio se incrementa un 3 %.
Para los locales, si tienen más de 50 metros cuadrados el precio se
incrementa un 1 %, si tienen 1 o ningún ventanal, su precio se reduce un 
2 % y si tienen más de 4 ventanales se añade un 2 %.

Realice las siguientes actividades:
Diseñe las jerarquías de clases, incluyendo los atributos y los métodos
que permitan manejar la información de la inmobiliaria.
Suponga que la clase base es abstracta y tiene un método abstracto para 
calcular el precio de cada inmueble.
Defina una interfaz que se llama Imprimir, y en esta interfaz dos métodos: 
uno para generar toda la información de cualquier inmueble y otro que permita
obtener solamente la información básica del inmueble, su precio base y su 
precio de venta.
Programe todos los componentes (clases e interfaces).
Cree una clase de prueba que permita probar los componentes desarrollados.
 */
package Parcial2;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public abstract class Inmobiliaria {
    private static int idActual=1;
     
    private int id;
    private double direccion;
    private double metrosc;
    private double estrato;
    private double ccatastral;
    private double precio;
     
    public Inmobiliaria (double direccion, double metrosc, double estrato 
            ,double ccatastral, double precio){
         
        this.id=idActual++;
         
        this.direccion=direccion;
        this.metrosc=metrosc;
        this.estrato=estrato;
        this.ccatastral=ccatastral;
        this.precio=precio;
         
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public double getDireccion() {
        return direccion;
    }
 
    public void setDireccion(double direccion) {
        this.direccion = direccion;
    }
    
     public double getMetrosc() {
        return metrosc;
    }
 
    public void setMetrosc(double metrosc) {
        this.metrosc = metrosc;
    }
    
     public double getEstrato() {
        return estrato;
    }
 
    public void setEstrato(double estrato) {
        this.estrato = estrato;
    }
    
     public double getCcatastral() {
        return ccatastral;
    }
 
    public void setCcatastral(double ccatastral) {
        this.ccatastral = ccatastral;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
 
    @Override
    public String toString() {
        return  "id=" + id + ", direccion=" + direccion + ", metrosc=" + metrosc
                +  ", estrato=" + estrato + ", ccatastral=" + ccatastral  
                + ", precio=" + precio  + " ";
    }

    Object getLargo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
    
    
    
     
   


