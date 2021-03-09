/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 
 * @author santiago cuellar
 */
public class Complejo {
    
    private double pReal; //Parte Real
    private double pImag; //Parte Imaginaria

    public Complejo() {
    }

    public Complejo(double pReal, double pImag) {
        this.pReal = pReal;
        this.pImag = pImag;
    }

    public double getpReal() {
        return pReal;
    }

    public double getpImag() {
        return pImag;
    }

    public void setpReal(double pReal) {
        this.pReal = pReal;
    }

    public void setpImag(double pImag) {
        this.pImag = pImag;
    }
    
    public Complejo suma(Complejo s){
        Complejo r=new Complejo();
        r.setpReal(this.pReal+s.getpReal());
        r.setpImag(this.pImag+s.getpImag());
        return r;
    }
    
    public Complejo suma(Complejo s1,Complejo s2){
        Complejo r=new Complejo();
        r.setpReal(s1.getpReal()+s2.getpReal());
        r.setpImag(s1.getpImag()+s2.getpImag());
        return r;
    }

    @Override
    public String toString() {
        return "Complejo{" + "pReal=" + pReal + ", pImag=" + pImag + '}';
    }
}