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
public class Apartamentos extends Inmobiliaria{
     private double canhabitaciones;
     private double numbaños;
     private int tipcociona;
     private boolean incremento;
    private boolean ccerrado;
 
    public Apartamentos(double canhabitaciones, double numbaños, int tipcociona, 
            boolean incremento, boolean ccerrado, double direccion,
            double metrosc, double estrato, double ccatastral, double precio) {
        super(direccion, metrosc, estrato, ccatastral, precio);
         this.canhabitaciones=canhabitaciones;
        this.numbaños=numbaños;
        this.tipcociona=tipcociona;
        this.incremento=incremento;
        this.ccerrado=ccerrado;
    }

    Apartamentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
     public double getCanhabitaciones() {
        return canhabitaciones;
    }
 
    public void setCanhabitaciones(double canhabitaciones) {
        this.canhabitaciones = canhabitaciones;;
    }
 
    public double getNumbaños() {
        return numbaños;
    }
 
    public void setNumbaños(double numbaños) {
        this.numbaños = numbaños;
    }
    
    
     public int getTipcociona() {
        return tipcociona;
    }
 
    public void setTipcociona(int tipcociona) {
        this.tipcociona = tipcociona;
    }
    
 
    public boolean getCcerrado() {
        return ccerrado;
    }
 
    public void setCcerrado(boolean ccerrado) {
        this.ccerrado = ccerrado;
    }
 
    public boolean isIncremento() {
        return incremento;
    }
 
    public void setIncremento(boolean incremento) {
        this.incremento = incremento;
    }
     
    @Override
    public double getPrecio(){
        if(isIncremento()){
            return super.getPrecio()*0.1;
        }else{
            return super.getPrecio()*0.3;
        }
    }
 
    @Override
    public String toString() {
        return super.toString() + "canhabitaciones=" +  canhabitaciones 
                + ", numbaños=" +  numbaños  + ", tipcocina=" +  tipcociona 
                + ", ccerrado=" +  ccerrado + ", incremento=" + incremento ;
    }
     
}
