import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {

    private List<Aluno> alunos;

    public GestaoAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(String nome, int idade) {
        alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno adicionado: " + nome);
    }

    public void excluirAluno(String nome) {
        boolean removido = alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Aluno removido: " + nome);
        } else {
            System.out.println("Aluno com nome '" + nome + "' não encontrado.");
        }
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return;
            }
        }
        System.out.println("Aluno com nome '" + nome + "' não encontrado.");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();

        gestao.adicionarAluno("Ana", 20);
        gestao.adicionarAluno("Bruno", 22);
        gestao.adicionarAluno("Carla", 19);

        gestao.listarAlunos();

        gestao.buscarAluno("Bruno");

        gestao.excluirAluno("Ana");

        gestao.listarAlunos();

        gestao.excluirAluno("Pedro");

        gestao.buscarAluno("Mariana");
    }
}