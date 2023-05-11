package segundoparcial;

import java.util.Scanner;
import Seccion.*;

public class Execution {
    
    public static Scanner dataInput = new Scanner(System.in);

    public static void RunApp(){
        Menu();
    }

    public static void  Menu(){
        boolean condition = true;
        int question;
        do{
            MenuText();
            question = dataInput.nextInt();
            switch(question){
                case 1 ->{Listado.ListaSecciones();}
                case 2 ->{Votos.porcentajeParticipacionReal(dataInput.nextInt());}
                case 3 ->{Votos.faltantes(dataInput.nextInt());}
                case 4 ->{Votos.porcentajeAbstinenciaReal(dataInput.nextInt());}
                case 0 ->{condition = false;}
            }
        }while(condition);
    }

    public static void MenuText(){
        System.out.println("\nElija una opcion.\n\n"+
                             "Añadir una Seccion. 1\n"+
                             "Porcentaje de participacion. 2\n"+
                             "Abstinencias. 3\n"+
                             "Porcentaje de abstinencia. 4\n"+
                             "Salir. 0\n");
    }
}
