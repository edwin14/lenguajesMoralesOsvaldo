
package Usuario2;


public class ProbarUsuario {


    public static void main(String[] args)throws Exception {
        Usuario edwin =new Usuario();   
        edwin.setNombre("Edwin");
        System.out.println("Esto debe salir siempre");
        edwin.setEdad(12);
        System.out.println("Aceptado!! eres mayor de edad");
    }
    
}
