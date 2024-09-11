package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(10, 20, 40);
		List<String> listaString = Arrays.asList("Samsung", "Aple");
		List<Object> listaObjeto = new ArrayList<>();
		//imprimirLista(listaNumeros);
		//imprimirLista(listaString);
		copiarLista(listaNumeros, listaObjeto);
		imprimirLista(listaObjeto);
	}
	
	public static void imprimirLista(List<?> lista) {
		for (Object o : lista) {
			System.out.println(o);
		}
		
	}
	public static void copiarLista(List<? extends Number> origem, List<?super Number>destino) {
		for (Number numero : origem) {
			destino.add(numero);
		}
	}
}
