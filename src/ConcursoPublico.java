import java.util.Scanner;

public class ConcursoPublico {

	static final Integer NOTA_CORTE = 60;
	static final Integer NOTA_APROVADO = 150;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("digite a nota de matemática: ");
		Integer notaMatematica = scan.nextInt();
		 
		System.out.println("digitel a nota de portugues: ");
		Integer notaPortugues = scan.nextInt(); 
		
		Boolean notaParcialMatematica = notaMatematica >= NOTA_CORTE;
		
		Boolean notaParcialPortugues = notaPortugues >= NOTA_CORTE;
		
		Boolean calculoMedia = (notaMatematica + notaPortugues) >= NOTA_APROVADO;
		
		if(notaParcialMatematica && notaParcialPortugues && calculoMedia) {
			Integer mediaProva = notaMatematica + notaPortugues;
			 System.out.println("O aluno esta aprovado, media final: " + mediaProva);;
		}
		else {
			System.out.println("o aluno está reprovado");
		}
		scan.close();

	}

}
