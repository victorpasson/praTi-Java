package exercicios.abstraction.FormasPagamento;

public abstract sealed class FormaPagamento permits CartaoCredito, Boleto, Pix {
    public abstract void processarPagamento(double valor);
    public abstract void validarPagamento();
}
