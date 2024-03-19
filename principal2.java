package aulaEstruturasDeDados18032024;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class principal2 {

    public static void exibir(List<Integer> lista) {
        for (Integer item : lista) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> lista = gerarListaAleatoria(10);
        List<Integer> lista2 = gerarListaAleatoria(10);
        
        System.out.println("Valores na Lista 1:");
        exibir(lista);
        
        System.out.println("Valores na Lista 2:");
        exibir(lista2);
        
        System.out.println("Exibindo valores comuns nas duas listas:");
        exibirValoresComuns(lista, lista2);
        
        System.out.println("Exibindo valores em uma só das listas:");
        exibirValoresUnicos(lista, lista2);
    }

    public static List<Integer> gerarListaAleatoria(int tamanho) {
        Random gerador = new Random();
        List<Integer> lista = new ArrayList<Integer>();
        
        while (lista.size() < tamanho) {
            int valor = gerador.nextInt(40);
            if (!lista.contains(valor)) {
                lista.add(valor);
            }
        }
        
        lista.sort(null);
        return lista;
    }

    public static void exibirValoresComuns(List<Integer> lista1, List<Integer> lista2) {
        for (Integer num : lista1) {
            if (lista2.contains(num)) {
                System.out.println(num);
            }
        }
    }

    public static void exibirValoresUnicos(List<Integer> lista1, List<Integer> lista2) {
        for (Integer num : lista1) {
            if (!lista2.contains(num)) {
                System.out.println(num);
            }
        }
        for (Integer num : lista2) {
            if (!lista1.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
