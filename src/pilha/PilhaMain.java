package src.pilha;

public class PilhaMain {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        int num = 0;

        // Empilhar pratos limpos
        System.out.println("====Empilhando os pratos====");
        for (int i = 0; i < p.getPilhaPratos().length; i++) {
            p.push("Prato" + num);
            System.out.println("Prato" + num);
            num++;
        }

        // Mostra o topo da pilha
        System.out.println("====Topo da pilha====");
        System.out.println(p.peek());

        // Tentando empilhar uma pilha cheia
        System.out.println("====Tentando empilhar uma pilha cheia====");
        p.push("Prato5");

        // Depois de comer, Desempilhar para lavar pratos sujos
        System.out.println("====Desempilhando os pratos====");
        for (int i = 0; i < p.getPilhaPratos().length; i++) {
            String pratoPop = p.pop();
            System.out.println("Pegou " + pratoPop);
        }

        // Tentando desempilhar uma pilha vazia
        System.out.println("====Tentando desempilhar uma pilha vazia====");
        String pratoPop = p.pop();
        System.out.println(pratoPop);
    }
}
