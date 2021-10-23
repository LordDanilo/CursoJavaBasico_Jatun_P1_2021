public class Mensaje{
    private int remitente;
    private int destinatario;
    private boolean leido; 
    private String contenido;
    private Hora horaEnvio;
    public Mensaje(int remitente, int destinatario, String contendio, Hora hora){
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.contenido = contendio;
        horaEnvio = hora;
        leido = false;
        
    }
    public void leerMensaje(){
        leido = true;
        System.out.println("Contenido: "+contenido);
    }
    public int getNumRemi(){
        return remitente;
    }
    public void verificarEstado(){
        if(leido){
            System.out.println("El mesaje que enviaste, ya fue leido");
        }else{
            System.out.println("El mesaje que enviaste, solo fue enviado");
        }
    }
}
