public class Ejemplo{
    private String cad;
    public Ejemplo()
    {
        cad = "DRAGON";
    }
    
    public int contarVocales(){
        int res = 0;
        String aux = cad.toLowerCase();
        
        for(int pos=0; pos<aux.length(); pos++){
            char actual = aux.charAt(pos);
            if(esVocal(actual)){
                res++;
            }
        }
        return res;
    }
    private boolean esVocal(char letra){
        return letra=='a' || letra=='e' || letra=='i' || letra =='o' || letra == 'u';
    }
}
