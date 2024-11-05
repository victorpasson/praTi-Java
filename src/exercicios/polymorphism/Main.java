package exercicios.polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IMeioTransporte> array = new ArrayList<>();
        IMeioTransporte carro = new Carro();
        IMeioTransporte bicicleta = new Bicicleta();
        IMeioTransporte trem = new Trem();
        array.add(carro);
        array.add(bicicleta);
        array.add(trem);
        array.forEach(IMeioTransporte::acelerar);
        array.forEach(IMeioTransporte::frear);
    }
}
