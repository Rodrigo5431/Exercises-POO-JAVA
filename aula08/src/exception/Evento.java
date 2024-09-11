package exception;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Evento {
	private String email;
	private Integer idade;

	public Evento(String email, Integer idade) {
		if (idade < 18) {
			throw new IllegalArgumentException("MENOR DE IDADE");
		} else {
			this.email = email;
			this.idade = idade;
			JOptionPane.showConfirmDialog(null, "confirma");
		}
	}

	public static void main(String[] args) {
		int opcao = 0;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				String email = JOptionPane.showInputDialog("email");
				Integer idade = Integer.parseInt(JOptionPane.showInputDialog("idade"));
				Evento evento = new Evento(email, idade);
				opcao = JOptionPane.showInternalConfirmDialog
						(null, "Deseja continuar", "iNFORMACAO", 0,1);
				
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		} while (opcao == 0);

	}

}
