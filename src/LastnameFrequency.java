import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LastnameFrequency {
    public static void main(String[] args) throws IOException {
        String linea;
        BufferedReader reader = new BufferedReader(new FileReader("Archivos/LastnameFrequencies.csv"));
        HashMap<String, String> contador = new HashMap<>();
        String apellido = "";
        String repetidor, numApellidos;

        while ((linea = reader.readLine()) != null) {
            String[] actual = linea.split(",");
            if (actual.length == 2){
                apellido = actual[0];
                numApellidos = actual[1];
                repetidor  = numApellidos.replaceAll("\\.","");
                contador.put(apellido, repetidor);
            }
        }
        System.out.println("Introduce el apellido deseado en mayúsculas (Déjalo en blanco para acabar):");
        Scanner scanner = new Scanner(System.in);
        while (true){
            apellido = scanner.nextLine();
            if (apellido.equals("")){
                reader.close();
                System.exit(0);
            }
            System.out.println(contador.get(apellido));
        }
    }
}