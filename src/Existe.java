import java.util.ArrayList;

public class Existe {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(6);
        lista.add(7);
        lista.add(9);
        lista.add(15);

        int num = Utilidades.leerEntero("Introduce un número a buscar en una lista:");

        if (lista.contains(num)) {
            System.out.println("El número " + num + " se encuentra en la lista");
        } else {
            System.out.println("El número " + num + " no se encuentra en la lista");
        }
    }
}
