public abstract class ElementoDeJuego{
    private String nombre;
    private int nivel;
    public String getNombre(){
        return nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int valor){
        nivel = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public abstract void cambiarNivel(int exp);
}
