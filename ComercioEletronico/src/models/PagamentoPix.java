package models;

public class PagamentoPix extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com Pix");
    }
}
