package Seccion;

public class Seccion {
    
    private int Id;
    private String Nombre;
    private float Latitud;
    private float Longitud;
    private int Municipio;
    private int Distrito;
    private int Listado;
    private int Votantes;

    public Seccion(int id, String nombre, float latitud, float longitud, int municipio, int distrito, int listado, int votantes){
        this.Id = id;
        this.Nombre = nombre;
        this.Latitud = latitud;
        this.Longitud = longitud;
        this.Municipio = municipio;
        this.Distrito = distrito;
        this.Listado = listado;
        this.Votantes = votantes;
    }

    public int getId(){
        return Id;
    }

    public void setId(int id){
        this.Id = id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }

    public float getLatitud(){
        return Latitud;
    }

    public void setLatitud(float latitud){
        this.Latitud = latitud;
    }

    public float getLongitud(){
        return Longitud;
    }

    public void setLongitud(float longitud){
        this.Longitud = longitud;
    }

    public int getMunicipio(){
        return Municipio;
    }

    public void setMunicipio(int municipio){
        this.Municipio = municipio;
    }

    public int getDistrito(){
        return Distrito;
    }

    public void setDistrito(int distrito){
        this.Distrito = distrito;
    }

    public int getListado(){
        return Listado;
    }

    public void setListado(int listado){
        this.Listado = listado;
    }

    public int getVotantes(){
        return Votantes;
    }

    public void setVotantes(int votantes){
        this.Votantes = votantes;
    }

}
