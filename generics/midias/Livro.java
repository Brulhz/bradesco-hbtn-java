public class Livro extends Midia {
    private int edicao;

    public Livro(String nome, int edicao) {
        super(nome);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Edicao: %d", edicao);
    }
}