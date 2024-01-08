import java.util.ArrayList;

public class Altura {
    public static int numeroAlumnos() {
        return Utilidades.leerEntero("¿Cuántos alumnos hay en la clase?");
    }

    public static ArrayList<Double> leerAlturas(int numAlumnos) {
        ArrayList<Double> alturas = new ArrayList<>();
        System.out.println("Introduce las alturas de los alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(Utilidades.leerDoble(""));
        }
        return alturas;
    }

    public static double calcularMedia(ArrayList<Double> alturas) {
        Double suma = 0D;
        for (Double altura : alturas) {
            suma += altura;
        }
        return suma / alturas.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, Double media) {
        int total = 0;
        for (Double altura : alturas) {
            if (altura > media) {
                total++;
            }
        }
        return total;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, Double media) {
        int total = 0;
        for (Double altura : alturas) {
            if (altura < media) {
                total++;
            }
        }
        return total;
    }

    public static void mostrarResultados(ArrayList<Double> alturas) {
        Double media = calcularMedia(alturas);
        int superior = calcularAlumnosAlturaSuperior(alturas, media);
        int inferior = calcularAlumnosAlturaInferior(alturas, media);
        System.out.println("Las alturas de los alumnos son:");
        for (Double altura : alturas) {
            System.out.println(altura + " ");
        }
        System.out.println("");
        System.out.println("La altura media es " + media);
        System.out.println("Hay " + superior + " alumnos con altura superior a la media");
        System.out.println("Hay " + inferior + " alumnos que no superan la altura media");
    }

    public static void main(String[] args) {
        int numAlumnos = numeroAlumnos();
        ArrayList<Double> alturas = leerAlturas(numAlumnos);
        mostrarResultados(alturas);
    }
}
