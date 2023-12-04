import java.util.ArrayList;
import java.util.Collections;

public class Convertir_a_array {
    public static void main(String[] args) {
        ArrayList<String> consolas = new ArrayList<>();
        consolas.add("XBOX");
        consolas.add("PlayStation");
        consolas.add("Nintendo Switch");
        consolas.add("Steam Deck");
        consolas.add("Nintendo WII");

        String[] str = new String[consolas.size()];
        for (int i = 0; i < consolas.size(); i++) {
            str[i] = consolas.get(i);
        }

        for (String s : str) {
            System.out.println(s);
        }
    }
}
