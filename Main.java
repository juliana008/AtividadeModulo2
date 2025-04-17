package executavel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Empregado;
import entidade.EmpregadosTercerizados;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número de empregados: ");
		int n = sc.nextInt();
		List<Empregado> empregados = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Empregado #"+(i+1)+" dados:");
			System.out.print("Tercerizado (s/n)?");
			sc.nextLine();
			char tercerizado = sc.next().charAt(0);
			
			Empregado a;
			
			if(tercerizado=='s') {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valor = sc.nextDouble();
				System.out.print("Valor adicional: ");
				double valorAdicional = sc.nextDouble();
				a = new EmpregadosTercerizados(nome, horas, valor, valorAdicional);
			}
			else {
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valor = sc.nextDouble();
				a = new Empregado(nome, horas, valor);
			}
			
			empregados.add(a);
			
		}
		
		System.out.println("PAGAMENTOS:");
		
		for(Empregado a : empregados) {
			System.out.println(a.getNome() + " - R$ " + String.format("%.2f", a.pagamento()));
		}
		
		sc.close();

	}

}
