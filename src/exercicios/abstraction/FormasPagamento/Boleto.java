package exercicios.abstraction.FormasPagamento;

public final class Boleto extends FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println(valor + " processando no Boleto.");
        this.validarPagamento();
    }

    @Override
    public void validarPagamento(){
        System.out.println("Pagamento em Boleto validado.");
    }
}
