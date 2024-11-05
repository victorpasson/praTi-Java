package exercicios.encapsulation;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        if (preco < 0){
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }

        this.preco = preco;
    }

    public void setQuantidade(int quantidade){
        if (quantidade < 0){
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }

        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
}
