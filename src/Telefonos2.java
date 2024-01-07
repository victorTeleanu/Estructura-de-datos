import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        //OK
        ArrayList<String> telefonos = new ArrayList<>();
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();
        telefonos.add("671 769 011");
        telefonos.add("661 983 775");
        agenda.put("Juan", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("665 578 125");
        telefonos.add("687 993 365");
        agenda.put("Marcos", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("609 712 754");
        agenda.put("Pablo", telefonos);

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Dime un contacto y te mostraré su número");
        String contacto = miScanner.next();

        if (agenda.containsKey(contacto)) {
            System.out.println("Su número es: " + agenda.get(contacto));
        } else {
            System.out.println("Ese contacto no está en tu lista de contactos");
        }
    }
}
