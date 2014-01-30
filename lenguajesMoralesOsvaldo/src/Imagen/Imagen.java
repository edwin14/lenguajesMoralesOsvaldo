
package Imagen;

/* @author Edwin Osvlado Morales Gomez*/
public class Imagen {
    private int alto;
    private int ancho;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if(alto<0)alto=-alto;
        this.alto = alto;
        System.out.println("El alto de la imagen es de : "+alto+" ");
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
         if(ancho<0)ancho=-ancho;
        this.ancho = ancho;
        System.out.println("El ancho de la imagen es de : "+ancho+" ");
    }
}
