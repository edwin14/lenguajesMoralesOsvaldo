
package Capitulo_5_Concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;


public class PrimerThreads implements Runnable{

   
    public static void main(String[] args) {
     // 1.- creado
     Runnable r=new PrimerThreads(); //Objeto polimorfico por que aqui se crea 
     Thread t1=new Thread(r);
     Thread t2=new Thread(r);
     t1.setName("Primero");
     t2.setName("Segundo");
     
     
     // 2.- inicializado
     t1.start(); // inicializa el thread, lo inicializa en la cola de los thread
     t2.start();
    }
     // 3.- En ejecucion
    public void run() {
        try { 
    if(Thread.currentThread().getName().equals("Primero")) Thread.sleep(4000);
    System.out.println("Soy un thread en ejecucion" + Thread.currentThread().getName());
    
        } catch (InterruptedException ex) {
            
        }
        
    }
     // 5.- Tremina la ejecucion
}
