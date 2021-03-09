/*
 Crea una clase Hora con atributos para las horas, los minutos y los segundos
de la hora. Incluye, al menos, los siguientes métodos:
• Constructor predeterminado con el 00:00:00 como hora por defecto.
• Constructor parametrizado con horas, minutos y segundos.
• leer(): pedirá al usuario las horas, los minutos y los segundos.
• valida(): comprobará si la hora es correcta; si no lo es la ajustará.
Será un método auxiliar (privado) que se llamará en el constructor
parametrizado y en leer().
• getters, setters.
• print(): mostrará la hora (07:03:21).
• aSegundos(): devolverá el número de segundos transcurridos desde 
la medianoche.
• deSegundos(int): hará que la hora sea la correspondiente a haber 
transcurrido desde la medianoche los segundos que se indiquen.
• segundosDesde(Hora): devolverá el número de segundos entre la hora
y la proporcionada.
• siguiente(): pasará al segundo siguiente.
• anterior(): pasará al segundo anterior.
• copia(): devolverá un clon de la hora.
• igualQue(Hora): indica si la hora es la misma que la proporcionada.
• menorQue(Hora): indica si la hora es anterior a la proporcionada.
• mayorQue(Hora): indica si la hora es posterior a la proporcionada.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835 
 * @author santiago cuellar
 */
public class Hora {
    private int horas;
  private int minutos;
  private int segundos;

  /** 
   * Constructor por omisi&oacute;n. Construye la hora 00:00:00 
   */
  public Hora() {
    this (0,0,0);
  }
  /** 
   * Constructor de una Hora a partir de la hora, los minutos y los segundos
   * @param h - valor para las horas
   * @param m - valor para los minutos
   * @param s - valor para los segundos
   */
  public Hora(int h, int m, int s) {
    asignarHora (h);
    asignarMinutos(m);
    asignarSegundos(s);
  }
  /**
   * Constructor de copia
   * @param h - Hora que se copiar&aacute;
   */
  public Hora(Hora h) {
    this(h.horas, h.minutos, h.segundos);  
  }

  /**
   * M�todo para obtener el n&uacute;mero de hora
   * @return int - las horas del objeto Hora
   */
  public int obtenerHora() {
    return horas;
  }
  /**
   * Metodo para obtener los minutos en una hora 
   * @return int - los minutos del objeto Hora
   */
  public int obtenerMinutos() {
    return minutos;
  }
  /**
   * Metodo para obtener los segundos en una hora 
   * @return int - los segundos del objeto Hora
   */
  public int obtenerSegundos() {
    return segundos;
  }
  /**
   * Metodo para asignar la hora
   * @param h - las horas para el objeto Hora
   */
  public void asignarHora(int h){
      if (h < 0 || h >= 24){
	new Error("Valor incorrecto para la hora se asignar&aacute; un cero"); 
      } else {
	  horas = h;
      }
  }
  /**
   * Metodo para asignarColoca los minutos de una hora 
   * @param m - los minutos para el objeto Hora
   */
  public void asignarMinutos(int m) {
      if (m < 0 || m > 59) {
	  new Error("El valor " +m + " no es apropiado praa los minutos."); 
      } else{
	  minutos = m;
      }
  }
  /**
   * Metodo para asignar los segundos de una hora 
   * @param s - los segundos para el objeto Hora
   */
  public void asignarSegundos(int s) {
      if (s < 0 || s > 59) {
	  new Error("El valor " + s + " no es apropiado para los segundos."); 
      } else {
	  segundos = s;
      }
  }
  /* Convierte una hora(hr:min:seg) a un n&uacute;mero entero que representa
   * los segundos transcurridos. Cada hora equivale a 3600 segs y cada
   * minuto a 60 segundos.
   */
  private int enSegundos() {
    return horas * 3600 + minutos * 60 + segundos;
  }
  /* Convierte un n&uacute;mero entero, que representa los segundos transcurridos,
   * en un objeto de la clase Hora.
   */
  private Hora enHoras(int n) {
    int hh, ss, mm;

    hh = n / 3600;
    n = n % 3600;
    ss = n % 60;
    mm = n /60; 
    return new Hora(hh, mm, ss);
  }
  /**
   * Metodo para sumar los minutos especificados al objeto que env&iacute;a el mensaje. 
   * Si los minutos son negativos se toma su valor absoluto.
   * @param mins - minutos que se sumar&aacute;n a la Hora.
   */
  public void sumar(int mins) {
    int segs = Math.abs(mins * 60);
    int sumaSegs = enSegundos() + segs;
    Hora resultado = enHoras(sumaSegs);

    this.horas = resultado.horas;
    this.minutos = resultado.minutos;
    this.segundos = resultado.segundos;
  }
  /** 
   * M&eacute;todo para sumar dos horas.
   * @param h - Hora que se sumar&aacute; a la hora actual.
   */
  public void sumar(Hora h) {
    int sumaSegs = h.enSegundos() + enSegundos();
    Hora resultado = enHoras(sumaSegs);

    this.horas = resultado.horas;
    this.minutos = resultado.minutos;
    this.segundos = resultado.segundos;
  }
  /**
   * Metodo para restar al objeto que env&iacute;a el mensaje (this) la 
   * hora especificada en el par&aacute;metro.
   * @param h - Hora que se restar&aacute;.
   */
  public Hora restar(Hora h) {
    int restaSegs;

    if (comparar(h) < 0)   // Determina cu&aacute;l es mayor
      restaSegs = h.enSegundos() - enSegundos();
    else
      restaSegs = enSegundos() - h.enSegundos();
    return enHoras(restaSegs);
  }
  /**
   * Metodo para comparar dos horas, devolviendo la relaci&oacute;n 
   * de orden entre ellas.
   * @param h - Hora con la que se comparar&aacute; el objeto que env&iacute;a
   * el mensaje.
   * @return int - la relaci&oacute;n de orden entre dos horas. >0, <0, =0
   */
  public int comparar(Hora h) {
    return enSegundos() - h.enSegundos();
  }
  /** 
   * Metodo para determinar si dos horas son iguales 
   * @param h - hora contra la cual se va a comparar
   * @return boolean - true si son iguales y false en otro caso
   */
  public boolean equals (Object h) {
      return comparar((Hora)h) == 0;
  }
  /** 
   * M&eacute;todo para convertir una Hora a cadena de caracteres 
   * @return String -- la hora en formato de cadena
   */
  public String toString() {
    return horas + ":" + minutos + ":" + segundos;
  }
}
