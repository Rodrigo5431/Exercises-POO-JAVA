package aula;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		
//		Date dataAtual = new Date();
//		
////		System.out.println(dataAtual);
////		System.out.println(dataAtual.getDate());
////		System.out.println(dataAtual.getDay());
//		Calendar hoje = Calendar.getInstance();
//		System.out.println(hoje);
//		int ano = hoje.get(Calendar.DAY_OF_MONTH);
//		System.out.println(ano);
	LocalDate hoje = LocalDate.now();
	LocalDate entrada = LocalDate.of(2024,9, 06);
	System.out.println(entrada);
	}

}
