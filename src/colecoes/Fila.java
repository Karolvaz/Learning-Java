package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adiciona elemento na fila
        // Diferença é o comportamento quando a fila está cheia!

        fila.add("Ana"); // Lança uma exceção
        fila.offer("Bia"); // Retorna False
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obter o próximo elementos da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia
        System.out.println(fila.peek()); // Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        System.out.println();

        // Poll e Remove -> Obter o próximo elemento da fila e remove!
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Retorna Null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        //System.out.println(fila.remove()); // Lança uma exceção

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...)

    }
}
