package exercicios.encapsulation;

public class ValidarDesconto extends Produto {
    public ValidarDesconto(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0.5){
            throw new IllegalArgumentException("Porcentagem de desconto inválida.");
        } else {
            double oldPrice = this.getPreco();
            this.setPreco(oldPrice * porcentagem);
        }
    }
}
