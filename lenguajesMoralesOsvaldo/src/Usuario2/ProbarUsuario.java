
package Usuario2;


public class ProbarUsuario {


    public static void main(String[] args)throws EdadNegativaException {
        Usuario edwin =new Usuario();   
        edwin.setNombre("Edwin");
        edwin.setEdad(12);
        System.out.println("Aceptado!! eres mayor de edad");
    }
    
}
