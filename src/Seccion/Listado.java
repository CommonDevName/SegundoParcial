package Seccion;

import java.util.ArrayList;
import java.util.Scanner;

public class Listado {
    
    public static ArrayList <Seccion> Lista = new ArrayList<>();

    public static void ListaSecciones(){
        Scanner dataInput = new Scanner(System.in);
        do{
            Lista.add(dataInput.nextInt(), dataInput.next(), dataInput.next(), dataInput.next(), dataInput.next(), dataInput.next(), dataInput.next(), dataInput.next())    
        }while();
    }
}
