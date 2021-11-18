public class Procesamiento
{
    public String clasificarAlimento (double calorias, double azucares, double grasas){
        String resultado;
        
        if(calorias> 200 || azucares> 20 ||grasas> 100){
            resultado="alimento poco saludable ";
        }
        else{
            resultado= "alimento saludable";

        }
        return resultado;
    }
    
}
