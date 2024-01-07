import java.util.ArrayList;
import java.util.HashMap;

public class Loteria {
    public static HashMap<Integer, Integer> terminacion(ArrayList<String> boletos) {

        HashMap<Integer, Integer> ultimoNum = new HashMap<>();
        for (String valor : boletos) {
            int cuenta = 1;
            int ultimo = Integer.parseInt("" + valor.charAt(valor.length() - 1));
            if (ultimoNum.containsKey(ultimo)) {
                cuenta = ultimoNum.get(ultimo)+1;
            }
            ultimoNum.put(ultimo, cuenta);
        }
        return ultimoNum;
    }
    public static void main(String[] args) {
        //OK
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("58975");
        boletos.add("25894");
        boletos.add("52985");
        boletos.add("98595");
        System.out.println(terminacion(boletos));
    }
}
