import java.util.Random;

public class Produtor extends Thread {
    private final Fila fila;
    private final Random random = new Random();

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int num = random.nextInt(100) + 1;  // 1 a 100
                fila.adicionar(num);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Produtor interrompido.");
        }
    }
}