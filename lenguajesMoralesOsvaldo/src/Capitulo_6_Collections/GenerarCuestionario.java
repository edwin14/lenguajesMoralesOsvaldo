package Capitulo_6_Collections;

import java.util.ArrayList;
public class GenerarCuestionario {
   public ArrayList<Pregunta> obtenerCuestionario(){ 
       Opcion op11=new Opcion("El Salvador",false);
       Opcion op21=new Opcion("Peru",false);
       Opcion op31=new Opcion("Mexico",false);
       Opcion op41=new Opcion("Filandia",true);
       
       ArrayList<Opcion> Opcion1=new ArrayList<Opcion>();
                 Opcion1.add(op11);
                 Opcion1.add(op21);
                 Opcion1.add(op31);
                 Opcion1.add(op41);
                 
        Pregunta p1=new Pregunta(1,"¿Cual es el pais con el mejor sistema educativo?", Opcion1);
       
    ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
            cuestionario.add(p1);
       
       return cuestionario;
        
    }
    
}
