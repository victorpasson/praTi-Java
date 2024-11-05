package exercicios.polymorphism;

public abstract sealed class Animal permits Cachorro, Gato, Vaca{
    public abstract void emitirSom();
}
