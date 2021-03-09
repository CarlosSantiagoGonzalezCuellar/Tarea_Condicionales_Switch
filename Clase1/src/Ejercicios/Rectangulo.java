/*
 Crea una clase Rectangulo que modele rectángulos por medio de cuatro puntos
(los vértices). Dispondrá de dos constructores: uno que cree un rectángulo
partiendo de sus cuatro vértices y otro que cree un rectángulo partiendo
de la base y la altura, de forma que su vértice inferior izquierdo esté 
en (0,0). La clase también incluirá un método para calcular la superficie
y otro que desplace el rectángulo en el plano.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 
 * @author santiago cuellar
 */
public class Rectangulo {
    private int ancho;
    private int alto;
   
	
  public int getAncho() {
		return ancho;
  }
	public void setAncho(int ancho) {
		this.ancho = ancho;
	
	
	for(int colCount=0;colCount<30;colCount++){
	
	}
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
		for (int rowCount=0;rowCount<30;rowCount++){
		}
			
	}
	
	
public void getArea(){
	int superfice;
	superfice = alto*ancho;

}
public void getPerimetro(){
	int perimeter;
	perimeter=alto+ancho+alto+ancho;
}

   public void drawn(){
    	int colCount=0;
    	int rowCount=0;
    	
    	while(rowCount<alto){
    		colCount=0;
    	while(colCount<ancho)
    		
    	
    	System.out.print("*");
    	colCount++;
    	}
System.out.println();   
   rowCount++;}
}

