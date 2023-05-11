package Seccion;

import static Seccion.Listado.Lista;

public class Votos {

    public static void porcentajeParticipacionReal(int id){
        double porcentaje;
        porcentaje = (Lista.get(id-1).getVotantes() / Lista.get(id-1).getListado())*100;
        System.out.println(porcentaje);
    }

    public static void porcentajeAbstinenciaReal(int id){
        double porcentaje;
        porcentaje = ((Lista.get(id-1).getListado() - 
        Lista.get(id-1).getVotantes())/
        Lista.get(id-1).getListado())*100;
        System.out.println(porcentaje);
    }

    public static void faltantes(int id){
        double faltantes;
        faltantes = Lista.get(id-1).getListado() - Lista.get(id-1).getListado();
        System.out.println(faltantes);
    }
}
