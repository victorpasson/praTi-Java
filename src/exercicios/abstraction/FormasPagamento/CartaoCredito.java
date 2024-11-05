package exercicios.abstraction.FormasPagamento;

public final class CartaoCredito extends FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println(valor + " processando no Cartão de Crédito.");
        this.validarPagamento();
    }

    @Override
    public void validarPagamento(){
        System.out.println("Pagamento em cartão de crédito validado.");
    }
}
