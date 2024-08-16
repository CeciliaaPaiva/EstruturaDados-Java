package src.listaEncadeada.simplesListaEncadeada;

import src.No;

public class SimplesLista {
    No cabeca;

    void adicionar(int valor){
        No novoNo = new No(valor);
        if (cabeca == null){
            cabeca = novoNo;
        } else {
             No atual = cabeca;
             while (atual.proximo != null){
                atual = atual.proximo;
             }
             atual.proximo = novoNo;
        }
    }

    
}
