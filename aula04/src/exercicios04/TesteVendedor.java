package exercicios04;

import java.util.Scanner;

public class TesteVendedor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Fixo f1 = new Fixo("Cleiton", "123456", 1500., 200., 1500.);// nome, cpf, salarioBase, comissao, salarioBruto
		Fixo f2 = new Fixo("Roni", "564789", 9000., 500., 9000.);

		while (true) {
			System.out.println("Qual vendedor voce deseja?\n" + "1)" + f1.nome + "\n" + "2)" + f2.nome);
			f1.setOpcaoVendedor(sc.nextInt());
			f1.escolhaVendedor();
			System.out.println("Digite o valor da venda: ");
			if (f1.getOpcaoVendedor() == 1) {
				f1.setValor(sc.nextDouble());
				f1.somaDasVendas();
			} else if (f1.getOpcaoVendedor() == 2) {
				f2.setValor(sc.nextDouble());
				f2.somaDasVendas();
			}
			System.out.println("Deseja encerrar o programa?\n1)Sim\t\t\t 2)Não");
			f1.setEncerraPrograma(sc.nextInt());
			if (f1.getEncerraPrograma() == 1) {
				System.out.println(f1);
				System.out.println(f2);
				break;
				
			} else if (f1.getEncerraPrograma() != 1 && f1.getEncerraPrograma() != 2) {
				System.out.println("Número invalido!");
			}
		}
	}

}
