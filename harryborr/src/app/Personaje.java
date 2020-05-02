package app;


public class Personaje {
    private String nombre;
    private int edad;
    private int salud;

    public String getNombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }

    public void setEdad( int edad){
        this.edad= edad;
    }
    
    public int getSalud(){
        return this.salud;
    }

    public void setSalud(int  salud){
        this.salud= salud;
    }


    public Personaje( String nombre, int edad, int salud){
        this.nombre= nombre;
        this.edad= edad;
        this.salud=salud;
    }

    public boolean estaVivo(){
        if( salud>0){
            return true;
        }else{
            return false;
        }
    }
}