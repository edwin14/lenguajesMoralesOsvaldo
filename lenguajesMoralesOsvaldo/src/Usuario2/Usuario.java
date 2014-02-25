package Usuario2;

public class Usuario {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadNegativaException {
        Validaciones.validarEdad(edad);
        this.edad = edad;
    }

    
}