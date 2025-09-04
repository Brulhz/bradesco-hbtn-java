import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;


    public Pedido() {
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie) {
        cookies.add(cookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int totalRemovido = 0;
        Iterator<PedidoCookie> it = cookies.iterator();
        while (it.hasNext()) {
            PedidoCookie cookie = it.next();
            if (cookie.getSabor().equals(sabor)) {
                totalRemovido += cookie.getQuantidadeCaixas();
                it.remove();
            }
        }
        return totalRemovido;
    }
}