import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        String coche;
        do {
            coche = Utilidades.leerCadena("Introduce marcas de coche:");
            if (coche.length() != 0) {
                coches.add(coche);
            }
        } while (coche.length() != 0);

        Collections.sort(coches);

        for (String cocheActual : coches) {
            System.out.println(cocheActual);
        }
    }
}
