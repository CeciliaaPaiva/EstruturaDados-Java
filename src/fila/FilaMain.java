package src.fila;

public class FilaMain {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        System.out.println(fila.desenfileirar()); // imprime 1
        System.out.println(fila.desenfileirar()); // imprime 2
        System.out.println(fila.desenfileirar()); // imprime 3
        System.out.println(fila.desenfileirar()); // imprime 4
    }
}
