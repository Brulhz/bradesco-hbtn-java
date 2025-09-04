import java.util.*;

public class Blog {
    private Set<Post> postagens;

    public Blog() {
        this.postagens = new HashSet<>();
    }

    public void adicionarPostagem(Post postagem) {
        if (postagens.contains(postagem)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post p : postagens) {
            autores.add(p.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<>();
        for (Post p : postagens) {
            contagem.put(p.getCategoria(), contagem.getOrDefault(p.getCategoria(), 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> resultado = new TreeSet<>();
        for (Post p : postagens) {
            if (p.getAutor().equals(autor)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> resultado = new TreeSet<>();
        for (Post p : postagens) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> mapa = new HashMap<>();
        for (Post p : postagens) {
            mapa.putIfAbsent(p.getCategoria(), new TreeSet<>());
            mapa.get(p.getCategoria()).add(p);
        }
        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> mapa = new HashMap<>();
        for (Post p : postagens) {
            mapa.putIfAbsent(p.getAutor(), new TreeSet<>());
            mapa.get(p.getAutor()).add(p);
        }
        return mapa;
    }
}