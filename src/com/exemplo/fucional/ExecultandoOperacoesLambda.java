package com.exemplo.fucional;

public class ExecultandoOperacoesLambda {
	// criar metodo principal
	public static void main(String[] args) {
		//implementar a operacao de soma
		OperacaoAritmetica novaSoma = (param1, param2) -> param1 + param2;
		
		//executando a operacao de soma
		double total = novaSoma.execute(8.9, 9.8);
		
		//exibir o resultado
		System.out.println("O resultado da operacao é: " + total);
	}
}
