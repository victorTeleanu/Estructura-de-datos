import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce una cadena:");
        if (bienParentizada(cadena)){
            System.out.println("La cadena está bien parentizada");
        } else {
            System.out.println("La cadena está mal parentizada");
        }
    }
    public static boolean bienParentizada (String cadena){
        Stack<Character> pila = new Stack<>();
        char letra;
        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            if (letra == '(' || letra == '[' || letra == '{'){
                pila.add(letra);
            } else if (letra == ')' || letra == ']' || letra == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                char ultimo = pila.pop();
                if (ultimo == '(' && letra != ')') return false;
                if (ultimo == '[' && letra != ']') return false;
                if (ultimo == '{' && letra != '}') return false;
            }

        }
        return pila.isEmpty();
    }
}