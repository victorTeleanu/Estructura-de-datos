import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static void main(String[] args) {
        System.out.println(repartir(2, 10, 20, 50, 200, 500));
    }
    public static String repartir (int participantes, int ... billetes) {
        HashMap<Integer, ArrayList<Integer>> rep = new HashMap<>();
        for (int i = 0; i < participantes; i++) {
            ArrayList<Integer> billetesARepartir = new ArrayList<>();
            for (int j = i; j < billetes.length; j += participantes) {
                billetesARepartir.add(billetes[j]);
            }
            rep.put(i, billetesARepartir);
        }
        return rep.toString();
    }
}

