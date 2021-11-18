import java.io.*;
public class Persistencia
{
    public void guardarDatos (String nombreAlimento, int cantidadAlimento, double calorias, double grasas, double azucares, String Clasificacion){
        /*** MODULO PERSISTENCIA ***/

        FileWriter fichero = null;
        BufferedWriter bw = null;
        File file = new File("ListaAlimentos.txt");
        try
        {
            if(!file.exists()){
                file.createNewFile();
            }
            fichero = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fichero);
            bw.write("Orden de los datos"+"\n");
            bw.write("Nombre Alimento, "+"Cantidad Alimento, "+"Calorias, "+"Grasas, "+"Azucares"+"\n"+"\n");
            bw.write(nombreAlimento +","+cantidadAlimento +","+calorias +","+grasas + ","+azucares +","+Clasificacion+"\n");
            bw.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if(bw !=null)
                    bw.close();
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }

    public void GuardarListaSalida (String nombreAlimentoSalida,int cantidadAlimentoSalida){
        double cantidadAlimento = 0;
        try{
            File archivo = new File("ListaAlimentos.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while(linea !=null){
                String registro [] = linea.split(",");
                for(int i=0; i<registro.length; i++){
                    System.out.println(registro[i]);
                }
                System.out.println(nombreAlimentoSalida+"    "+registro[0]+nombreAlimentoSalida == registro[0]);
                System.out.println(nombreAlimentoSalida.length() +"    "+registro[0].length());
                if(nombreAlimentoSalida.equals(registro[0])){
                    System.out.println("Salir del ciclo");
                    break;
                }
                linea = br.readLine();
            }
            System.out.println(linea);
            cantidadAlimento = Double.parseDouble(linea.split(",")[1]);
        } catch (Exception e) {
            e.printStackTrace();}
        FileWriter ficheroSalida = null;
        BufferedWriter bw = null;
        File fileSalida = new File("listadecompra.txt");
        try
        {
            if(!fileSalida.exists()){
                fileSalida.createNewFile();
            }
            ficheroSalida = new FileWriter(fileSalida.getAbsoluteFile(), true);
            bw = new BufferedWriter(ficheroSalida);
            System.out.println(cantidadAlimento+"    "+ cantidadAlimentoSalida);
            bw.write("Nombre: "+nombreAlimentoSalida +"\n");
            bw.write("Cantidad: "+(cantidadAlimento - (double)cantidadAlimentoSalida) +"\n");
            bw.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                
                if(bw !=null)
                    bw.close();
                if (null != ficheroSalida)
                    ficheroSalida.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        }
    }
}
