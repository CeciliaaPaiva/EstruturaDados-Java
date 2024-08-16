package src.pilha;

public class StackResize<E> {
    private static final int TAMANHO = 8;

    private E[] a;
    private int topo;

    public StackResize() {
        this.a = (E[]) new Object[TAMANHO];
        this.topo = 0;
    }

    public void pushRsz(E item){
        if (topo == a.length) resize(a.length * 2);
        a[topo++] = item;
    }

    public E pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack underflow");
        E item = a[topo -1];
        a[topo-1] = null;
        topo--;

        if (topo > 0 && topo == a.length/4) resize(a.length/2);
        return item;
    }

    public E peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack underflow");
        return a[topo-1];
    }

    public void resize(int capacidade){
        assert capacidade >= 0;

        E[] copia = (E[]) new Object[capacidade];
        for (int i = 0; i < topo; i++){
            copia[i] = a[i];
        }
        a = copia;
    }

    public boolean isEmpty(){
        return topo == 0;
    }

    public int size(){
        return topo;
    }

    public static void main(String[] args) throws Exception {
        StackResize pilha = new StackResize();
        System.out.println("Deve ser true: "+pilha.isEmpty());
        // eu gosto de pizza mas prefiro hamburguer
        pilha.pushRsz("Eu gosto de ");
        pilha.pushRsz("pizza ");
        pilha.pushRsz("mas prefiro ");
        pilha.pushRsz("hamburguer ");
        System.out.println("Deve ser false: "+pilha.isEmpty());

        String burguer = (String) pilha.pop();
        System.out.println("Tirou: "+burguer);
        System.out.println("Tirou: "+pilha.pop());
        String pizza = (String) pilha.pop();
        System.out.println("Tirou: "+pizza);

        // eu gosto de hamburguer mas prefiro pizza
        pilha.pushRsz(burguer);
        System.out.println("Adicionei: "+pilha.peek());
        pilha.pushRsz("mas prefiro ");
        System.out.println("Adicionei: "+pilha.peek());
        pilha.pushRsz(pizza);
        System.out.println("Adicionei: "+pilha.peek());

    }
}


