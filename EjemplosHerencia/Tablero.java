import java.util.ArrayList;
public class Tablero{
    private ArrayList<ElementoDeJuego> lista;
    public Tablero(){
        lista = new ArrayList<>();
        generarDatos();
    }
    public ArrayList<Heroe> buscarHeroes(){
        ArrayList<Heroe> res = new ArrayList<>();
        for(int pos=0; pos<lista.size(); pos++){
            ElementoDeJuego actual = lista.get(pos);
            if(actual instanceof Heroe){
                Heroe aux = (Heroe)actual;
                res.add(aux);
            }
        }
        return res;
    }
    public void add(ElementoDeJuego nuevo){
        lista.add(nuevo);
    }
    public void generarDatos(){
        ElementoDeJuego heroe1   = new Heroe("Dariel",10, 5);
        ElementoDeJuego monster1 = new Monstruo("Dino",true);
        ElementoDeJuego heroe2   = new Heroe("Danilo",17, 50);
        ElementoDeJuego monster2 = new Monstruo("Tibu",false);
        ElementoDeJuego objeto1  = new Objeto("Arco","Legendaria");
        add(heroe1);
        add(monster1);
        add(heroe2);
        add(monster2);
        add(objeto1);
    }
}
