import java.util.ArrayList;
import java.util.Collections;
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int celular;
    private int edad;
    private ArrayList<Persona> contactos;
    private ArrayList<Mensaje> bandejaDeEntrada;
    private ArrayList<Mensaje> bandejaDeSalida;

    public Persona(String nombre, int celular, int edad){
        this.nombre  = nombre;
        this.celular = celular;
        this.edad    = edad;
        contactos = new ArrayList<>();
        bandejaDeEntrada = new ArrayList<>();
        bandejaDeSalida = new ArrayList<>();
    }

    public void addAmigo(Persona amigo){
        contactos.add(amigo);
    }

    public Persona buscarAmigoPorCelular(int celuAmigo){
        Persona res = null;
        for(int pos=0; pos<contactos.size() && res==null; pos++){
            Persona act = contactos.get(pos);
            int celuActual = act.getCelular();
            if(celuActual == celuAmigo){
                res = act;
            }
        }
        return res;
    }

    public Persona buscarAmigoPorNombre(String nombreAmigo){
        Persona res = null;
        for(int pos=0; pos<contactos.size() && res==null; pos++){
            Persona act = contactos.get(pos);
            String nombreActual = act.getNombre();
            if(nombreActual.equals(nombreAmigo)){
                res = act;
            }
        }
        return res;
    }

    public int getCelular(){
        return celular;
    }

    public String getNombre(){
        return nombre;
    }

    public void ordenarContactos(){
        Collections.sort(contactos);
    }

    @Override
    public int compareTo(Persona otro){
        String nombreAmigo = otro.getNombre();
        return nombre.compareTo(nombreAmigo);
    }

    public void enviarMensaje(int celuAmigo, String contenido){
        Mensaje nuevoSMS = new Mensaje(celular,celuAmigo,contenido, new Hora(12,30,15));
        Persona destino = buscarAmigoPorCelular(celuAmigo);
        destino.recibirMensaje(nuevoSMS);
        bandejaDeSalida.add(nuevoSMS);
    }

    public void recibirMensaje(Mensaje nuevo){
        bandejaDeEntrada.add(nuevo);
    }

    public void revisarBandejaEntrada(){
        for(int pos=0; pos<bandejaDeEntrada.size(); pos++){
            Mensaje act = bandejaDeEntrada.get(pos);
            act.leerMensaje();
        }
    }

    public void revisarBandejaEntradaPorCelular(int celularAmigo){
        for(int pos=0; pos<bandejaDeEntrada.size(); pos++){
            Mensaje act = bandejaDeEntrada.get(pos);
            int celuRemi = act.getNumRemi();
            if(celuRemi == celularAmigo){
                act.leerMensaje();
            }
        }
    }
    public void revisarBandejaSalida(){
        for(int pos=0; pos<bandejaDeSalida.size(); pos++){
            Mensaje act = bandejaDeEntrada.get(pos);
            act.verificarEstado();
        }
    }
}
