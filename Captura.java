import java.util.Scanner;

/*** MODULO CAPTURA ***/

public class Captura
{
    String nombreAlimento;
    int cantidadAlimento;
    double calorias;
    double azucares;
    double grasas;
    String nombreAlimentoSalida;
    int cantidadAlimentoSalida;
    Scanner scann = new Scanner(System.in);
    public void CapturarProductos (){
        System.out.println("nombre de alimento: ");
        nombreAlimento = scann.nextLine();
        System.out.println("cantidad de alimento: ");
        cantidadAlimento= scann.nextInt();
        System.out.println("Caracteristicas");
        System.out.println("calorias : ");
        calorias= scann.nextDouble();
        System.out.println("azucares : ");
        azucares= scann.nextDouble();
        System.out.println("grasas : ");
        grasas= scann.nextDouble();
    }
    
    public void CapturaProductosSalida (){
        System.out.println("nombre de alimento a retirar: ");
        nombreAlimentoSalida= scann.nextLine();
        System.out.println("cantidad de alimento de retirar: ");
        cantidadAlimentoSalida= scann.nextInt();
    }
    
    public double getCalorias(){
        return calorias;
    }
    
    public String getNombreAlimento(){
        return nombreAlimento;
    }

    public int getCantidadAlimento(){
        return cantidadAlimento;
    }

    public double getAzucares(){
        return azucares;
    }

    public double getGrasas(){
        return grasas;
    }
    
    public String getNombreAlimentoSalida(){
        return nombreAlimentoSalida;
    }

    public int getCantidadAlimentoSalida(){
        return cantidadAlimentoSalida;
    }

}