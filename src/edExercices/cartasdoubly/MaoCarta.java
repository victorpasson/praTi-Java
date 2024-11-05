package edExercices.cartasdoubly;

public class MaoCarta {
    public Carta head;
    public Carta tail;
    public int size;

    public MaoCarta(){
        this.head = new Carta(null);
        this.tail = new Carta(null);
        this.head.next = this.tail;
        this.size = 0;
    }

    public void adicionarCarta(String novaCarta){
        Carta newCarta = new Carta(novaCarta);
        if (this.size == 0){
            this.head = newCarta;
            this.tail = newCarta;
        } else {
            this.head.prev = newCarta;
            tail.next = newCarta;
            newCarta.next = this.head;
            newCarta.prev = this.tail;
            this.head = newCarta;
        }
        this.size++;
    }

    public void remove(int index){
        if (index == 0){
            this.head = this.head.next;
            this.head.prev = this.tail;
            this.tail.next = this.head;
            this.size--;
            return;
        }

        if (index == (this.size - 1)){
            this.tail.prev = this.tail.next;
            this.tail = this.tail.prev;
            this.size--;
            return;
        }

        Carta current = this.getIndex(index);
        current.prev.next = current.next;
        current.next.prev = current.prev;
        this.size--;
    }

    public void mudarMao(int indexInicial, int indexFinal){
        Carta posicaoAtual = getIndex(indexInicial);
        Carta posicaoFinal = getIndex(indexFinal);

        Carta controllerPrev = posicaoFinal.prev;
        Carta controllerNext = posicaoFinal.next;

        posicaoAtual.prev.next = posicaoFinal;
        posicaoAtual.next.prev = posicaoFinal;
        posicaoFinal.prev = posicaoAtual.prev;
        posicaoFinal.next = posicaoAtual.next;

        posicaoAtual.prev = controllerPrev;
        posicaoAtual.next = controllerNext;
        controllerPrev.next = posicaoAtual;
        controllerNext.prev = posicaoAtual;

        if(indexFinal == 0){
            this.head = posicaoAtual;
        }

        if (indexFinal == (this.size - 1)) {
            this.tail = posicaoAtual;
        }

    }

    public Carta getIndex(int index){
        Carta current = this.head;

        if (head == null){
            throw new IndexOutOfBoundsException("Index fora dos limites/inválido.");
        }

        if (index >= this.size){
            throw new IndexOutOfBoundsException("Index fora dos limites/inválido.");
        }

        if (index == 0) {
            return this.head;
        }

        if (index == (this.size - 1)){
            return this.tail;
        }

        int count = 0;
        while (count < this.size && count < index){
            current = current.next;
            count++;
        }

        return current;
    }

    public void verMao(){
        if (this.size == 0){
            System.out.println("Não há cartas na mão.");
        } else {
            int count = 0;
            Carta current = this.head;
            while (count < this.size){
                System.out.printf("%d - %s%n", count, current.carta);
                current = current.next;
                count++;
            }
        }
    }
}
