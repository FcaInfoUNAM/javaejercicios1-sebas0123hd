package Exercises;

public class Hijo extends Padre {
    public String nombre;

    public Hijo(String nombre, String apellido) {
        super(apellido);
        this.nombre = nombre;
    }
}
