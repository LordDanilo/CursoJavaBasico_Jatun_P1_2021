//Modificador de Acceso, palabra reservada class, nombre de La Clase
public class Personaje{
    //Modificador de Acceso, tipo de dato, nombre del atributo
    private String nombre;
    private int nivel;
    
    public Personaje(String valorNombre){
        nombre = valorNombre;
        nivel = 1;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setNivel(int valor){
        nivel = valor;
    }
}
