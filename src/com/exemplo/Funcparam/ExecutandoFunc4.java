package com.exemplo.Funcparam;

public class ExecutandoFunc4 {

	public static void main(String[] args) {
		// uso do lambda composto
		ExemploFuncional4 novosDados = (nome, idade, salario) -> {
			String nomeMaiusculo = nome.toUpperCase();
			if (idade < 18) {
				System.out.println("O colaborador nao pode ter menos de 18 anos. ");
			} else {
				System.out.println("O colaborador " + nomeMaiusculo + "Recebe o salario " + salario);
			}

		};
		novosDados.exibirDados("Sr. Batata ", 58, 6500.21);
	}
}
