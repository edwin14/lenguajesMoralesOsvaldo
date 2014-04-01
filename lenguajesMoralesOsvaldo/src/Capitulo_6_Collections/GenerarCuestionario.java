package Capitulo_6_Collections;

import java.util.ArrayList;
public class GenerarCuestionario {
   public static ArrayList<Pregunta> obtenerCuestionario(){ 
       Opcion op11=new Opcion("El Salvador",false);
       Opcion op21=new Opcion("Peru",false);
       Opcion op31=new Opcion("Mexico",false);
       Opcion op41=new Opcion("Filandia",true);
       
       ArrayList<Opcion> Opcion1=new ArrayList<Opcion>();
                 Opcion1.add(op11);
                 Opcion1.add(op21);
                 Opcion1.add(op31);
                 Opcion1.add(op41);
                 
        Pregunta p1=new Pregunta(1,"1.-¿Cual es el pais con el mejor sistema educativo?", Opcion1);
        
        
        
        
       Opcion op12=new Opcion("Mexico",false);
       Opcion op22=new Opcion("Corea del Norte",true);
       Opcion op32=new Opcion("Ecuador",false);
       Opcion op42=new Opcion("Filandia",false);
       
       ArrayList<Opcion> Opcion2=new ArrayList<Opcion>();
                 Opcion2.add(op12);
                 Opcion2.add(op22);
                 Opcion2.add(op32);
                 Opcion2.add(op42);
                        
        Pregunta p2=new Pregunta(2,"2.-¿Cual es el pais que da mas miedo?", Opcion2);
        
        
       
    ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
    
            cuestionario.add(p1);
            cuestionario.add(p2);
       
       return cuestionario;
        
    }
    
}
