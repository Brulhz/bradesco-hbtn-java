public class Numero {
    public static void dividir(int a, int b) {
        int resultado = 0;

        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            resultado = 0;
        } finally {
            System.out.println(a + " / " + b + " = " + resultado);
        }
    }
}