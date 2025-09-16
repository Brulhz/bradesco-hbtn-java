import java.util.Locale;

@Override
public String toString() {
    return String.format(
            new Locale("pt", "BR"),
            "[%d] %s %s %d R$ %.6f",
            codigo, nome, cargo, idade, salario
    );
}
