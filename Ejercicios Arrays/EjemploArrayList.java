import java.util.ArrayList;
public class EjemploArrayList{
    private ArrayList<Integer> lista;
    
    public EjemploArrayList(){
        lista = new ArrayList<>();
    }
    public void agregarValor(int valor){
        lista.add(valor);
    }
    public Integer obtenerValor(int pos){
        return lista.get(pos);
    }
    public Integer eliminarValor(int pos){
        return lista.remove(pos);
    }
}
