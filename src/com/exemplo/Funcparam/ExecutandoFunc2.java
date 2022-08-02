package com.exemplo.Funcparam;

public class ExecutandoFunc2 {

	public static void main(String[] args) {
		// implementando referenciando metodo sem parametros
		ExemploFuncional2 execultar = () -> System.out.println("Ola mundo do java funcional");
		execultar.exibirDados();
	}

}
