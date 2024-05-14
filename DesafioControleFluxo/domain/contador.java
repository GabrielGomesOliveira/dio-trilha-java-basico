package domain;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class contador {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("--------------DESAFIO CONTROLE DE FLUXO--------------");
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = lerInteiro(entrada);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = lerInteiro(entrada);
        
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) 
                System.out.println("Emprimindo a " + i + "ª interação: " + i);
            }
        }
    
    public static int lerInteiro(Scanner scanner){
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }
}
