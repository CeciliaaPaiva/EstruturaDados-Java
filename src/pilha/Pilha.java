package src.pilha;

public class Pilha { // Stack
    /*Regra LIFO: Last in first out - Último a entrar primeiro a sair
    * Push: Empilha
    * Pop: Desempilha
    * Peek: Olha o topo da pilha
    * - Imagine uma pilha de pratos, quando precisa comer você pop o prato do topo
    * depois de lavar este, você push o prato na pilha.
    * */

    String pilhaPratos[];
    int topo;

    public Pilha() {
        this.pilhaPratos = new String[5];
        this.topo = 0;
    }

    public void push(String prato){ // Empilhar
        if (isFull()){
            System.out.println("Pilha cheia!");
            return;
        }
        pilhaPratos[topo] = prato;
        topo++;
    }

    public String pop(){ // Desempilhar
        if (isEmpty()){
            return "Pilha vazia!";
        }
        topo--;
        String prato = pilhaPratos[topo];
        pilhaPratos[topo] = null;
        return prato;
    }

    public String peek(){
        if (isEmpty()) System.out.println("Pilha vazia!");
        return pilhaPratos[topo -1];
    }

    public boolean isFull(){
        return (topo == pilhaPratos.length);
    }

    public boolean isEmpty(){
        return (topo == 0);
    }

    public String[] getPilhaPratos() {
        return pilhaPratos;
    }
}
