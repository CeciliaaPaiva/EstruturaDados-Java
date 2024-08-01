package src.fila;

public class Fila { // Queue
    /*Regra FIFO: First In, First Out - O primeiro elemento adicionado é o último a ser removido
    *É uma sequencia de elementos(nó), Cada nó contem um valor e referencia para o proximo nó da fila
    * Enfilerar - adiciona um novo nó ao final da fila
    * Desenfilerar -Remove o nó do indice 0 da fila, ou seja, o mais antigo
    * isVazia - verifica se está vazia
    * */

    private Elemento inicio; // Ponteiro para o primeiro nó da fila
    private Elemento fim; // Ponteiro para o ultimo nó da fila
    private int tamanho;

    void enfileirar(int valor) {
        Elemento novo = new Elemento(valor);
        if (isVazia()){
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo; // Aponta para o próximo espaco livre
            fim = novo; // Já que o novo elemento foi adicionado, o fim é nele
        }
        tamanho++;
    }

    int desenfileirar() {
        if (isVazia()){
            throw new NullPointerException("A fila esta vazia");
        }
        int elementoAsair = inicio.valor;
        if (inicio.proximo == null){
            inicio = null;
            fim = null;
        }else {
            inicio = inicio.proximo;
        }
        tamanho--;
        return elementoAsair;
    }

    boolean isVazia() {
        return inicio == null;
    }
}
