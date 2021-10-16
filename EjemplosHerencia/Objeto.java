public class Objeto extends ElementoDeJuego{
    private String rareza;
    private int usos;
    private int contExp;
    public Objeto(String nombre, String rareza){
        usos = 0;
        contExp = 0;
        this.rareza = rareza;
        setNombre(nombre);
        setNivel(1);
    }
    @Override
    public void cambiarNivel(int exp){
        contExp = contExp+exp;
        if(contExp > 50){
            int act = getNivel();
            setNivel(act+2);
            contExp = 0;
        }
    }
}
