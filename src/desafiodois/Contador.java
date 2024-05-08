package desafiodois;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = leitor.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = leitor.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException exception) {
			exception.printStackTrace();
		}
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException(parametroUm, parametroDois);
		}
		
		int contagem = parametroDois - parametroUm;
		System.out.printf("O número de ocorrências baseado nas entradas vai ser %d - %d = %d\n",parametroDois, parametroUm, contagem);
		for (int i = 0; i<contagem;i++) {
			System.out.print((i+1) + " ");
		}
	}

}
