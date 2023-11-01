package modelo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    // @Override
    // public String toString() {
    // return "{" +
    // " nombre='" + getNombre() + "'" +
    // ", edad='" + getEdad() + "'" +
    // "}";
    // }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + nombre + "'" +
                ", edad='" + edad + "'" +
                "}";
    }

}
