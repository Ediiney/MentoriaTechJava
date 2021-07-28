import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		Double contaLuz;
		Double contaAgua;
		Double contaTelefone;
		Double contaEscola;
		Double faturaCartao;
		Double supermercado;
		
		System.out.println("Contas a pagar:\n Digite  os valores das Contas: " );
		System.out.println("\n CONTA DE LUZ:");
		contaLuz = scan.nextDouble();
		
		System.out.println("\n CONTA DE ÁGUA:");
		contaAgua = scan.nextDouble();
		
		System.out.println("\n CONTA DE TELEFONE:");
		contaTelefone = scan.nextDouble();
		
		System.out.println("\n CONTA DA ESCOLA DO FILHO:");
		contaEscola = scan.nextDouble();
		
		System.out.println("\n FATURA DO CARTÃO:");
		faturaCartao = scan.nextDouble();
		
		System.out.println("\n SUPERMECADO:");
		supermercado = scan.nextDouble();
		
		System.out.println("");
		
		Double totalGastos = contaLuz + contaAgua + contaTelefone + contaEscola + faturaCartao + supermercado;
		
		
		System.out.println("O Valor a de gastos desta familia ao final do mês é de: " + totalGastos);
		
		scan.close();

	}

}
