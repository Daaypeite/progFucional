package com.exemplo.Funcparam;

public class ExecutandoFunc7 {

	public static void main(String[] args) {
		ExemploFuncional6 calculando = Financeiro::calculaJuros;
		System.out.println("Valor final: " + calculando.execute(1200.0, 9.3));

	}

}
