import java.util.Scanner;

public class Tarefas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String[] cadastrarTarefas = new String[5];
		
		System.out.println("LISTA DE TAREFAS \n CADASTRE SUAS TAREFAS: ");
		
		for(int contador=0; contador <cadastrarTarefas.length; contador ++) {
			System.out.println(contador + " º tarefa:");
			cadastrarTarefas[contador] = scan.nextLine();
		}
		
		System.out.println("LISTA DE TAREFAS TAREFAS: ");
		
		for(int contador=0; contador <cadastrarTarefas.length; contador ++) {
			System.out.println(cadastrarTarefas[contador]);
		}
		
		scan.close();
		

	}

}
