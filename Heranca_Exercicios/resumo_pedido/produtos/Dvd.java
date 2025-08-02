package produtos;

public class Dvd extends Produto {
    private String diretor;
    private String genero;
    private int duracao;

    public Dvd(String titulo, int ano, String pais, double preco, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, preco);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        return preco * 1.20; // 20% acréscimo
    }
}