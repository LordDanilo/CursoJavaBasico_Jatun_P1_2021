public class UnicornioBot{
    private String nombre;
    
    public UnicornioBot(String valorNombre){
        nombre = valorNombre;
    }
    public String saludar(){
        String saludo = "Hola "+nombre;
        return saludo;
    }
    public void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
