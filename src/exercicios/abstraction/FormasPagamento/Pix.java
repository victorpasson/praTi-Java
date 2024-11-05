package exercicios.abstraction.FormasPagamento;

public final class Pix extends FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println(valor + " processando no Pix.");
        this.validarPagamento();
    }

    @Override
    public void validarPagamento(){
        System.out.println("Pagamento em Pix validado.");
    }
}
