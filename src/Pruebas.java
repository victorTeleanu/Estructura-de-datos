import java.util.ArrayList;

public class Pruebas {
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, Double media) {
        int total = 0;
        for (Double altura : alturas) {
            if (altura > media) {
                total += altura;
            }
        }
        return total;
    }
}
