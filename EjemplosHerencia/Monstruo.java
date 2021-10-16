public class Monstruo extends ElementoVivo{
    private boolean jefe;
    public Monstruo(String nombre, boolean valor){
        jefe = valor;
        setVida(50);
        setAtaque(20);
        setNombre(nombre);
        setNivel(2);
    }
    @Override
    public void cambiarNivel(int exp){
        int aux = getNivel();
        setNivel((aux*2)+(exp/2));
    }
}
