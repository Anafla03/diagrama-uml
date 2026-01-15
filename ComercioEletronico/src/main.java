import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ===== Cliente =====
        Cliente cliente = new Cliente();

        // ===== Produtos =====
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // ===== Itens do Pedido =====
        ItemPedido item1 = new ItemPedido();
        ItemPedido item2 = new ItemPedido();

        // ===== Lista de Itens =====
        List<ItemPedido> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        // ===== Pedido =====
        Pedido pedido = new Pedido();

        // ===== Forma de Pagamento =====
        Pagamento pagamento = new PagamentoBoleto();
        pagamento.pagar();

        System.out.println("Cliente realizou um pedido com " + itens.size() + " itens.");
        System.out.println("Fluxo do sistema testado com sucesso.");
    }
}
