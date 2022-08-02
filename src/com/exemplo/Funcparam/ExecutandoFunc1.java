package com.exemplo.Funcparam;

public class ExecutandoFunc1 {

	public static void main(String[] args) {
		// utilizando de expressao lambda
		ExemploFuncional1 dados = (nome, idade, salario) -> System.out.println(
				"Parabens " + nome.toUpperCase() +
				"pelos seus " + idade +
				"anos de vida. Seu novo salario é: " + salario);
		dados.exibirDados("Coisinha ", 40 , 5500.23);
	}

}
