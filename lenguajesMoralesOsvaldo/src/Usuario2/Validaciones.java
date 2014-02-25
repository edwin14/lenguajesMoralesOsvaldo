

package Usuario2;


public class Validaciones {
    
    public void validarEdad(int edad) throws EdadNegativaException{ 
        if(edad<18) throw new EdadNegativaException(); 
    }
}
