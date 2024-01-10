import java.io.*;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException{
        String linea;
        BufferedReader reader = new BufferedReader(new FileReader("Archivos/Colfuturo-Seleccionados.csv"));
        HashMap<String, Integer> contador = new HashMap<>();
        while ((linea = reader.readLine()) != null) {
            String[] datoActual = linea.split(",");
            String pais = datoActual[6];
            int repetidor = 1;
            if (contador.containsKey(pais)) {
                repetidor = contador.get(pais) + 1;
            }
            contador.put(pais,repetidor);
        }
        System.out.println(contador);
    }
}
