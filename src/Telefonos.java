import java.util.HashMap;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        HashMap<String, String> contactos = new HashMap<>();
        contactos.put("Juan" , "674 592 783");
        contactos.put("Maria" , "648 901 009");
        contactos.put("Pedro" , "623 116 740");
        contactos.put("Fran" , "699 764 532");
        contactos.put("Julia" , "609 992 125");

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Dime un contacto y te mostraré su número");
        String contacto = miScanner.next();

        if (contactos.containsKey(contacto)) {
            System.out.println("Su número es: " + contactos.get(contacto));
        } else {
            System.out.println("Ese contacto no está en tu lista de contactos");
        }
    }
}
