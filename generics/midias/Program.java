import java.util.*;

public class Program {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("Xato", 1);
        Livro livro2 = new Livro("Coracoes sujos", 3);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", 1);

        // Criando vídeos
        Video video1 = new Video("Aprendendo Java Generics", 25);
        Video video2 = new Video("Apresentando Wildcards Generics em Java", 25);

        // Criando jornais
        Jornal jornal1 = new Jornal("Folha de Sao Paulo", 130);
        Jornal jornal2 = new Jornal("Estadao", 113);

        // Biblioteca apenas de livros
        Biblioteca<Livro> bibliotecaLivros = new Biblioteca<>();
        bibliotecaLivros.adicionarMidia(livro1);
        bibliotecaLivros.adicionarMidia(livro2);
        bibliotecaLivros.adicionarMidia(livro3);

        System.out.println("Biblioteca de Livros:");
        for (Livro livro : bibliotecaLivros.obterListaMidias()) {
            System.out.println(livro + " - Edição: " + livro.getEdicao());
        }

        System.out.println("\nBiblioteca de Mídias:");
        // Biblioteca de mídias variadas
        Biblioteca<Midia> bibliotecaMidias = new Biblioteca<>();
        bibliotecaMidias.adicionarMidia(livro1);
        bibliotecaMidias.adicionarMidia(video1);
        bibliotecaMidias.adicionarMidia(video2);
        bibliotecaMidias.adicionarMidia(jornal2);

        for (Midia midia : bibliotecaMidias.obterListaMidias()) {
            System.out.print(midia);
            // Exibindo atributos específicos
            if (midia instanceof Livro) {
                System.out.println(" - Edição: " + ((Livro) midia).getEdicao());
            } else if (midia instanceof Video) {
                System.out.println(" - Duração: " + ((Video) midia).getDuracao() + " min");
            } else if (midia instanceof Jornal) {
                System.out.println(" - Quantidade de Artigos: " + ((Jornal) midia).getQuantidadeArtigos());
            } else {
                System.out.println();
            }
        }
    }
}