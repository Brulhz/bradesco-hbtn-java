import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    private List<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int totalRemovidos = 0;
        Iterator<PedidoCookie> iterator = cookies.iterator();
        while (iterator.hasNext()) {
            PedidoCookie cookie = iterator.next();
            if (cookie.getSabor().equalsIgnoreCase(sabor)) {
                totalRemovidos += cookie.getQuantidadeCaixas();
                iterator.remove();
            }
        }
        return totalRemovidos;
    }
}