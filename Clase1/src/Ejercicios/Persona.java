/*
Se trata de crear una pequeña base de datos de personas de una universidad. 
De momento definiremos y probaremos las siguientes clases:
a. Direccion:
• atributos: calle, ciudad, código postal, pais
• Constructores predeterminado y parametrizado.
b. Persona: Clase ya creada (con nombre, apellidos y número de identificación,
ver ejercicio anterior) a la que añadiremos el atributo dirección y sus métodos
get y set. Esta clase implementa la interface
Programación Orientada a Objetos Ejercicios — Pág. 11
Ingeniería Técnica Informática de Sistemas
Humano, con un método identificate(), que muestra el tipo de la clase que 
lo implementa (el tipo de persona, en este caso).
c. Estudiante: Subclase de Persona.
• Atributos: ID de estudiante
• Constructores: predeterminado y constructor parametrizado que admita el ID.
• Métodos get, set y toString().
d. Profesor: Subclase de Persona.
• Atributos: despacho
• Constructores: predeterminado y constructor parametrizado que admita 
el despacho.
• Métodos get, set y toString()
Crea una lista de personas (con la clase Vector) y prueba a añadir varios 
alumnos y varios profesores a la lista y sus operaciones.
8. Define una jerarquía de clases que permita almacenar datos sobre los 
planetas y satélites que forman parte del sistema solar (junto con el sol).
Algunos atributos que puede ser interesante recoger son: la masa del cuerpo, 
su diámetro medio, el período de rotación sobre el propio eje, período de 
traslación alrededor del cuerpo que orbitan, distancia media a ese cuerpo, 
excentricidad de la órbita, etc.
Define un método que, dado un objeto del sistema solar (planeta o satelite), 
imprima toda la información de que se dispone sobre el mismo.
 */
package Ejercicios;

/**
 * Carlos Santiago Gonzalez Cuellar - COD: 20201186835
 * @author santiago cuellar
 */
public abstract class Persona {
       
    /*Atributos*/
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
     
    /*Contantes*/
    private final String[] NOMBRES_CHICOS={"Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"}; 
    private final String[] NOMBRES_CHICAS={"Alicia", "Laura", "Clotilde", "Pepa", "Elena"}; 
    private final int CHICO=0;
    private final int CHICA=1;
     
    /*Constructores*/
    public Persona(){
         
        //entre 0 y 1
        int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0,1);
         
        //Si es 0 es un chico
        if(determinar_sexo==CHICO){
            nombre=NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo='H';
        }else{
            nombre=NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo='M';
        }
         
        //Indicamos la disponibilidad
        disponibilidad();
         
    }
 
    /*Metodos*/
     
    /**
     * Devuelve el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * Modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    /**
     * Devuelve el sexo de la persona
     * @return 
     */
    public char getSexo() {
        return sexo;
    }
 
    /**
     * Modifica el sexo de la persona
     * @param sexo 
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
 
    /**
     * Devuelve la edad de la persona
     * @return 
     */
    public int getEdad() {
        return edad;
    }
 
    /**
     * Modifica la edad de la edad
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    /**
     * Indica la asistencia de la persona
     * @return 
     */
    public boolean isAsistencia() {
        return asistencia;
    }
 
    /**
     * Modifica la asistencia de la persona
     * @param asistencia 
     */
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
     
    //abtracto, las clases hijas deben implementarlo
    public abstract void disponibilidad();
     
}

