
package Tarjeta;

/*@author Edwin Osvaldo Morales Gomez*/
public class Tarjeta {
    
    public Tarjeta() {
      nombreCliente="juan";  
    }
    
    private int numeroTarjeta;
    private String nombreCliente;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
}
