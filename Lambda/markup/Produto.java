import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private double preco;
    private String nome;
    private double percentualMarkup;

    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkup;

    private Produto(double preco, String nome, double percentualMarkup) {
        this.preco = preco;
        this.nome = nome;
        this.percentualMarkup = percentualMarkup;

        this.precoComMarkup = () -> preco + (preco * this.percentualMarkup / 100);
        this.atualizarMarkup = (novoMarkup) -> this.percentualMarkup = novoMarkup;
    }

    public static Produto criarProduto(double preco, String nome) {
        return new Produto(preco, nome, 10.0); // markup inicial 10%
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}