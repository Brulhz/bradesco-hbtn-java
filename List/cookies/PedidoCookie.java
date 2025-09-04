import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        return lista.indexOf(numero); // indexOf retorna -1 se não encontrado
    }

    public static void adicionarNumero(List<Integer> lista, int numero) {
        if (buscarPosicaoNumero(lista, numero) != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
        lista.add(numero);
    }

    public static void removerNumero(List<Integer> lista, int numero) {
        int pos = buscarPosicaoNumero(lista, numero);
        if (pos == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        lista.remove(pos);
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        int pos = buscarPosicaoNumero(lista, numeroSubstituir);
        if (pos != -1) {
            lista.set(pos, numeroSubstituto);
        } else {
            lista.add(numeroSubstituto);
        }
    }
}