public class Heroe extends ElementoVivo{   
    private int defensa;
    public Heroe(String nombre, int ataque, int defensa){
        this.defensa = defensa;
        setVida(100);
        setAtaque(ataque);
        setNombre(nombre);
        setNivel(1);
    }
    @Override
    public void cambiarNivel(int exp){
        int aux = getNivel();
        setNivel(aux+exp);
    }
    public int getDefensa(){
        return 100;
    }
}
