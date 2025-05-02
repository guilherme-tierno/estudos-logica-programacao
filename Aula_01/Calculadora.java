import java.util.Scanner;

public class Calculadora {
	public static void main (String[]args) {
		//Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		
		//Entrada de dados
		System.out.println("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		leitor.close(); //Interromper a comunicação com o teclado -> máquina
		
		//Processamento
		resultado = (numero1 + numero2);
		
		//Saída de dados
		System.out.println("O resultado da soma é " + resultado);
	}
}
