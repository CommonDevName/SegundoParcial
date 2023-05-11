package Seccion;

import java.util.ArrayList;
import static segundoparcial.Execution.dataInput;

public class Listado {
    
    public static ArrayList <Seccion> Lista = new ArrayList<>();

    public static void ListaSecciones(){
        boolean condition = true;
        String question;
        do{
            System.out.println("\nAgrege los datos pertinentes\n");
            Lista.add(new Seccion(dataInput.nextInt(), dataInput.next(), dataInput.nextFloat(), dataInput.nextFloat(), dataInput.nextInt(), dataInput.nextInt(), dataInput.nextInt(), dataInput.nextInt()));  
            System.out.println("\nQuiere agregar otro? Y o N.\n");
            question = dataInput.next();
            switch(question){
                case "Y"->{}
                case "N"->{condition = false;}
            }
        }while(condition);
    }
}
