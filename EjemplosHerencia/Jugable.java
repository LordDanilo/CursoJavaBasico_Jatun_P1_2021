
/**
 * Write a description of interface Jugable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Jugable
{
    final static int vida = 100;
    int mover(int x, int y);
    String atacar(Object otro);
    boolean estaVivo();
}
