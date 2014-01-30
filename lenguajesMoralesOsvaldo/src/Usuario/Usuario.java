
package Usuario;

/* @author Edwin */
public class Usuario {
    private String nombre; 
    private int edad;

    public int getEdad() {
        //System.out.println(" no es mayor de edad");
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>0 && edad<18){
            System.out.println("El usuario introducido no es mayor de edad ");
        }
        
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
