
package Usuario2;

public class EdadNegativaException extends Exception{
    
    public EdadNegativaException(){ // no es neceario ponerle un constructor, por que lo da por defecto y por eso no marca error
                                    // en todo caso con la palabra SUPER pone el constructor del papa
        super("Lo siento peor eres menor de edad");
    }
    
}
