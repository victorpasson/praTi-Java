package exercicios.polymorphism;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Animal> arrayAnimal = new ArrayList<>();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        arrayAnimal.add(cachorro);
        arrayAnimal.add(gato);
        arrayAnimal.add(vaca);

        arrayAnimal.forEach(Animal::emitirSom);
    }
}
