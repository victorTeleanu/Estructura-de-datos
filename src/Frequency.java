import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static HashMap<String, Integer> Frequencia(ArrayList<String> palabras) {
        HashMap<String, Integer> palabra = new HashMap<>();
        for (String word : palabras) {
            int contador = 1;
            if (palabra.containsKey(word)) {
                contador = palabra.get(word)+1;
            }
            palabra.put(word, contador);
        }
        return palabra;

    }

    public static void main(String[] args) {
        //OK
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("Introduce palabras (déjalo en blanco para acabar)");
        Scanner miScanner = new Scanner(System.in);
        String palabra;
        while (miScanner.hasNextLine()) {
            palabra = miScanner.nextLine();
            if (palabra.isEmpty()) {
                break;
            }
            palabras.add(palabra);
        }
        System.out.println(Frequencia(palabras));
    }
}