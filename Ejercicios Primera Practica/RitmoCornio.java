public class RitmoCornio{
    private String cancion1;
    private String cancion2;
    private String cancion3;
    private boolean enPausa;
    private int cancionActual;
    public RitmoCornio(String nombreCancion1, String nombreCancion2, String nombreCancion3){
        cancion1 = nombreCancion1;
        cancion2 = nombreCancion2;
        cancion3 = nombreCancion3;
        enPausa  = true;
        cancionActual = 1;
    }
    public String reproducirCancion(){
        String respuesta = "";
        if(enPausa){
            enPausa = false;
            respuesta = "La Canción ha empezado a sonar";
        }else{
            respuesta = "Ya está sonando una canción";
        }
        return respuesta;
    }
    public String pausarCancion(){
        String respuesta = "";
        if(enPausa){
            respuesta = "La canción ya se encuentra en Pausa";
        }else{
            enPausa = true;
            respuesta = "La canción ha sido Pausada";
        }
        return respuesta;
    }
    public void cambiarCancion(){
        cancionActual++;
        enPausa = false;
        if(cancionActual > 3){
            cancionActual = 1;
        }
    }
    public String consultarCancionActual(){
        String res = "La Cancion que esta sonando es: ";
        if(cancionActual == 1){
            res = res+cancion1;
        }else{
            if(cancionActual == 2){
                res = res+cancion2;
            }else{
                res = res+cancion3;
            }
        }
        return res;
    }
}
