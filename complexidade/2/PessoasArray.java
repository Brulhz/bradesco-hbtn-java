public class PessoasArray {
    private String[] nomes;

    public PessoasArray() {
        nomes = new String[]{
                "Amanda", "Beatriz", "Carlos", "Daniela", "Eduardo",
                "Fabio", "Gustavo", "Hingrid", "Isabela", "Joao",
                "Leise", "Maria", "Norberto", "Otavio", "Paulo",
                "Quirino", "Renata", "Sabata", "Tais", "Umberto",
                "Vanessa", "Xavier"
        };
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // Busca binária O(log n)
    public void buscaBinaria(String nome) {
        System.out.println("Procurando o nome: \"" + nome + "\"");
        int esquerda = 0;
        int direita = nomes.length - 1;
        boolean encontrado = false;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            System.out.println("Passando pelo indice: " + meio);

            int comparacao = nomes[meio].compareTo(nome);

            if (comparacao == 0) {
                System.out.println("Nome " + nomes[meio] + " encontrado na posição " + meio);
                encontrado = true;
                break;
            } else if (comparacao < 0) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        if (!encontrado)
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
    }
}