package com.exemplo.fucional;

public class ExecultandoOperacaoes {
	public static void main(String[] args) {
		OperacaoAritmetica operacao = new Soma();
	double result = operacao.execute(15.8, 8.3);
	System.out.println(result);
	}
}
