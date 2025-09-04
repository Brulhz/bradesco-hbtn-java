import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        ManipularArrayNumeros.adicionarNumero(numeros, 1);
        ManipularArrayNumeros.adicionarNumero(numeros, 3);
        ManipularArrayNumeros.adicionarNumero(numeros, 6);
        ManipularArrayNumeros.adicionarNumero(numeros, 9);

        System.out.println(numeros); // Saída: [1, 3, 6, 9]

        try {
            ManipularArrayNumeros.adicionarNumero(numeros, 9);
        } catch(Exception ex) {
            System.out.println(ex.getMessage()); // Saída: Numero jah contido na lista
        }

        ManipularArrayNumeros.removerNumero(numeros, 3);
        ManipularArrayNumeros.removerNumero(numeros, 9);

        System.out.println(numeros); // Saída: [1, 6]

        try {
            ManipularArrayNumeros.removerNumero(numeros, 9);
        } catch(Exception ex) {
            System.out.println(ex.getMessage()); // Saída: Numero nao encontrado na lista
        }

        ManipularArrayNumeros.substituirNumero(numeros, 3, 5);
        System.out.println(numeros); // Saída: [1, 6, 5]

        ManipularArrayNumeros.substituirNumero(numeros, 5, 3);
        System.out.println(numeros); // Saída: [1, 6, 3]
    }
}