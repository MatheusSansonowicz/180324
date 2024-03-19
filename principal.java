package aulaEstruturasDeDados18032024;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class principal {

	    public static void exibir(List<Integer> lista) {
	        for (Integer item : lista) {
	            System.out.println(item);
	        }
	    }
	    public static void main(String a[]) {
	        List<Integer> lista = new ArrayList<Integer>();
	        
	        List<Integer> lista2 = new ArrayList<Integer>();
	        
	        //Scanner teclado = new Scanner(System.in);
	        Random gerador = new Random();
	        int valor;
	        for (int i = 0; i < 5; i++) {
	            //System.out.print("Digite um numero inteiro: ");
	            //valor = teclado.nextInt();
	            valor = gerador.nextInt(10);
	            if (!lista.contains(valor)) {
	                lista.add(valor);
	                lista.sort(null);
	            }
	        }
	        for (int i = 0; i < 5; i++) {
	            //System.out.print("Digite um numero inteiro: ");
	            //valor = teclado.nextInt();
	            valor = gerador.nextInt(10);
	            if (!lista2.contains(valor)) {
	                lista2.add(valor);
	                lista2.sort(null);
	            }
	        }
	        System.out.println("Tamanho da lista " + lista.size());
	        exibir(lista);
	        System.out.println("Tamanho da lista 2 " + lista2.size());
	        exibir(lista2);
	        
	        System.out.println("Exibindo valores comuns nas duas listas:");
	    
	        for (Integer num : lista) {
	            if (lista2.contains(num)) {
	                System.out.println(num);
	            }
	        }
	        
	        System.out.println("Exibindo valores em uma só das listas:");
	        for (Integer num : lista) {
	            if (!lista2.contains(num)) {
	                System.out.println(num);
	            }
	        }
	        for (Integer num : lista2) {
	            if (!lista.contains(num)) {
	                System.out.println(num);
	            }
	        }
	    }
}
