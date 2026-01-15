package models;

import java.util.List;

public class Pedido {

    private int id;
    private String data;
    private double total;

    private Cliente cliente;
    private List<ItemPedido> itens;
    private Pagamento pagamento;
}
