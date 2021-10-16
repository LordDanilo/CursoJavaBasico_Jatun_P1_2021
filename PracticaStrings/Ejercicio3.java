public class Ejercicio3{
    public String invertirCadena1(String cad){
        String res = "";
        for(int pos = 0; pos<cad.length(); pos++){
            char act = cad.charAt(pos);
            res = act+res;
        }
        
        return res;
    }
    public String invertirCadena2(String cad){
        String res = "";
        //der-izq
        for(int pos = cad.length()-1; pos>=0; pos--){
            char act = cad.charAt(pos);
            res = res+act;
        }
        return res;
    }
    public String invertirCadena3(String cad){
        StringBuilder res = new StringBuilder(cad);
        res = res.reverse();
        return res.toString();
    }
}
