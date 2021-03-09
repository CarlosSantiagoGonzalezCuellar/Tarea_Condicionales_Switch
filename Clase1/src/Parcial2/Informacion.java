/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Informacion {
    //Atributos
    private Inmobiliaria[][] productos;
 
    //Constructores
    public Informacion(int ancho, int largo) {
        productos = new Inmobiliaria[ancho][largo];
    }
 
    public Informacion() {
        productos = new Inmobiliaria[5][5];
    }
 
    //Metodos
     
    /**
     * Agega un inmueble, primera posicion que encuentre
     * @param b 
     */
    public void agregarInmueble(Inmobiliaria b) {
 
        boolean encontrado = false;
        for (int i = 0; i < productos.length && !encontrado; i++) {
            for (int j = 0; j < productos[0].length && !encontrado; j++) {
                if (productos[i][j] == null) {
                    productos[i][j] = b; //inserto el inmueble
                    encontrado = true; //Salgo
                }
            }
        }
 
        //Indico si se ha añadiddo el inmueble o no
        if (encontrado) {
            System.out.println("inmueble añadido");
        } else {
            System.out.println("No se ha podido añadir el inmueble");
        }
 
    }
 
    /**
     * Elimina el inmueble con el id que le pasen, sino esta se indica
     * @param id 
     */
    public void eliminarInmueble(int id) {
 
        boolean encontrado = false;
        for (int i = 0; i < productos.length && !encontrado; i++) {
            for (int j = 0; j < productos[0].length && !encontrado; j++) {
                if (productos[i][j] != null) {
                    if (productos[i][j].getId() == id) {
                        productos[i][j] = null; //Elimino el inmueble
                        encontrado = true; //Salgo
                    }
                }
            }
        }
 
        //Indico si se ha eliminado
        if (encontrado) {
            System.out.println("inmueble eliminado");
        } else {
            System.out.println("No existe el inmueble");
        }
 
    }
 
    /**
     * Recorro los productos y muestro los inmuebles
     */
    public void mostrarInmuebles() {
 
         
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if (productos[i][j] != null) {//controlo nulos
                    System.out.println("ancho " + i + ", largo: " + j 
                            + " Inmueble: " + productos[i][j].toString());
                }
            }
        }
 
    }
 
    /**
     * Calculo el precio de todos los inmuebles
     * @return 
     */
    public double calcularPrecioInmueble() {
 
        double precioTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if (productos[i][j] != null) {//controlo nulos
                    precioTotal += productos[i][j].getPrecio();//acumulo el precio
                }
            }
        }
 
        return precioTotal;
 
    }
 
    /**
     * Calculo el precio de todos los inmuebles de largo
     * @return 
     */
    public double calcularPrecioInmueble(String largo) {
 
        double precioTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[0].length; j++) {
                if (productos[i][j] != null) {//controlo nulos
 
                    if (productos[i][j].getLargo().equalsIgnoreCase(largo)) {
                        precioTotal += productos[i][j].getPrecio(); //acumulo el precio
                    }
 
                }
            }
 
        }
 
        return precioTotal;
    }
 
    /**
     * Calculo el precio de todas los inmuebles de ancho
     * @return 
     */
    public double calcularPrecioInmueble(int ancho) {
 
        double precioTotal = 0;
        if (ancho >= 0 && ancho < productos[0].length) {
 
            for (int i = 0; i < productos.length; i++) {
 
                if (productos[i][ancho] != null) { //controlo nulos
                    precioTotal += productos[i][ancho].getPrecio(); //acumulo el precio
                }
 
            }
 
        } else {
            System.out.println("La columna debe estar entre 0 y " 
                    + productos[0].length);
        }
 
        return precioTotal;
 
    }
 
}

