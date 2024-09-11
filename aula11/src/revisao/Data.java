package revisao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

		public static void main(String[] args) {
			
			Instant data = Instant.now();
			System.out.println(data);
			
			LocalDateTime hora = LocalDateTime.now();
			System.out.println(hora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a")));
			
		
		}
}
