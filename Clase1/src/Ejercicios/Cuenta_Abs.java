/*
Define una clase abstracta Cuenta con los siguientes atributos:
• numerocuenta : entero largo
• saldo : double
• cliente : atributo de la clase Persona (que tiene nombre y apellidos,
y Número de documento de id)
y con los siguientes métodos:
• Constructor parametrizado que recibe un cliente y un número de cuenta
• Setters y getters para los tres atributos
• ingresar(double): permitirá ingresar una cantidad en la cuenta.
• abstract retirar(double): permitirá sacar una cantidad de la cuenta 
(si hay saldo). No se implementa, depende del tipo de cuenta
• actualizarSaldo(): actualizará el saldo de la cuenta, pero cada cuenta
lo hace de una forma diferente
Define las subclases de Cuenta que se describen a continuación:
• CuentaCorriente: Cuenta normal con un interés fijo del 1.5%. Incluir
constructor parametrizado y método toString().
• CuentaAhorro: Esta cuenta tiene como atributos el interés variable a 
lo largo del año y un saldo mínimo necesario. Al retirar dinero hay que
tener en cuenta que no se sobrepase el saldo mínimo. Incluir constructor 
parametrizado, método toString() y método para cambiar el interés.
Crea un programa que cree varias cuentas y pruebe sus características.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public class Cuenta_Abs {
    //Atributos
    private String titular;
    private double cantidad;
 
    //Constructores
    public Cuenta_Abs(String titular) {
        this(titular, 0); //Sobrecarga
    }
 
    public Cuenta_Abs(String titular, double cantidad) {
        this.titular = titular;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }
 
    //Metodos
    public String getTitular() {
        return titular;
    }
 
    public void setTitular(String titular) {
        this.titular = titular;
    }
 
    public double getCantidad() {
        return cantidad;
    }
 
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
 
    /**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
 
    /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
 
    /**
     * Devuelve el estado del objeto
     *
     * @return
     */
    @Override
    public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }
 
}

