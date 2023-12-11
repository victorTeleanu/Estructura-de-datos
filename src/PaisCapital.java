import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<String, String>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");
        capitales.put("Alemania", "Berlín");

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Dime de que país quieres saber la capital");
        String capital = miScanner.nextLine();

        if (capitales.containsKey(capital)) {
            System.out.println("La capital de " + capital + " es: " + capitales.get(capital));
        } else {
            System.out.println("Ese país no está en la lista");
        }

    }
}
