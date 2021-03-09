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
public class Locales extends Inmobiliaria{
     private double numventas;
     private boolean incremento;
    private boolean ccomercial;
 
    public Locales(double numventas, boolean incremento, boolean ccomercial, 
            double direccion, double metrosc, double estrato, double ccatastral,
            double precio) {
        super(direccion, metrosc, estrato, ccatastral, precio);
         this.numventas=numventas;
         this.incremento=incremento;
        this.ccomercial=ccomercial;
        
    }
 
     public double getNumventas() {
        return numventas;
    }
 
    public void setNumventas(double numventas) {
        this.numventas = numventas;
    }
 
 
    public boolean getCcomercial() {
        return ccomercial;
    }
 
    public void setCcomercial(boolean ccomercial) {
        this.ccomercial = ccomercial;
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
            return super.getPrecio()*0.2;
        }
    }
 
    @Override
    public String toString() {
        return super.toString() + "numventas=" +  numventas  + ", ccomercial=" 
                +  ccomercial  +  ", incremento=" + incremento ;
    }
     
}
