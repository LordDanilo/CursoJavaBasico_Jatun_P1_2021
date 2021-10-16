public class Ejercicio1{
    public String calcularDistancia(String name1, String name2){
        String res = "";
        int sum1 = calcularSumatoria(name1);
        int sum2 = calcularSumatoria(name2);
        int resta = Math.abs(sum1-sum2); 
        res = "La distancia entre "+name1+" y "+name2+" es de "+resta;
        return res;
    }
    
    private int calcularSumatoria(String cad){
        int res = 0;
        for(int pos=0; pos<cad.length(); pos++){
            char act = cad.charAt(pos);
            res = res+act;
        }
        return res;
    }
}
