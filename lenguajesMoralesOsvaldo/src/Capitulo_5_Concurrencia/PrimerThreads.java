
package Capitulo_5_Concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;


public class PrimerThreads implements Runnable{

   
    public static void main(String[] args) {
     // 1.- creado
     Runnable r=new PrimerThreads(); //Objeto polimorfico por que aqui se crea 
     Thread tl=new Thread(r);
     
     Thread t2=new Thread(r);
     // 2.- inicializado
     tl.start(); // inicializa el thread, lo inicializa en la cola de los thread
     t2.start();
    }
     // 3.- En ejecucion
    public void run() {
        try { 
            Thread.sleep(4000);
            System.out.println("Soy un thread en ejecucion");
        } catch (InterruptedException ex) {
            
        }
        
    }
     // 5.- Tremina la ejecucion
}
