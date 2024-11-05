package exercicios.abstraction.FormasPagamento;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();
        cartao.processarPagamento(200);
        boleto.processarPagamento(50);
        pix.processarPagamento(20);
    }
}
