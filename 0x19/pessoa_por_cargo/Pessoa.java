import java.util.Locale;

public class Pessoa {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public int getIdade() { return idade; }
    public double getSalario() { return salario; }

    @Override
    public String toString() {
        // Formata salário com ponto decimal e depois troca por vírgula para padrão brasileiro
        return String.format("[%d] %s %s %d R$ %.6f",
                        codigo, nome, cargo, idade, salario)
                .replace('.', ',');
    }
}