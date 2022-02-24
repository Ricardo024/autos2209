package holamundo;
/**
 * @author ricar
 */
public class Persona {
    private String nombre;
    private int edad;

    //metodo constructor
    public Persona() {
    }
        //metodo constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    } 
    //metodo de uso general
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void comer(String platillo){
       System.out.println (this.nombre + " Está comiendo" + platillo);
    }
}
