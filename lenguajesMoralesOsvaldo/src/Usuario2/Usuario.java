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

    public void setEdad(int edad) {
        if(edad>0 && edad<18){
            System.out.println("Este usuario aun no es mayor de edad");
       
        }
   
        this.edad = edad;
    }

    
}