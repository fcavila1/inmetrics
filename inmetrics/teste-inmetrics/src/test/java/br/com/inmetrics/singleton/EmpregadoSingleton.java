package br.com.inmetrics.singleton;

import br.com.inmetrics.model.EmpregadoModel;

public class EmpregadoSingleton {

	private static EmpregadoModel empregado;
	
	public static EmpregadoModel getInstance() {
		if(empregado == null) {
			empregado = new EmpregadoModel();
		}
		return empregado;
	}
	
}
