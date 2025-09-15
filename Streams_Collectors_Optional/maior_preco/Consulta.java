import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Consulta {

    // Método já existente: retorna os livros de um pedido
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    // Novo método: retorna o produto com maior preço da lista
    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .max(Comparator.comparing(Produto::getPreco))
                .orElse(null); // retorna null caso a lista seja vazia
    }
}