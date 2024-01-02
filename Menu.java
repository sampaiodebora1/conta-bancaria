package conta.model;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	
	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(123456, 123, "Débora de Fátima", 2500);
		
		ContaPoupanca cp1 = new ContaPoupanca(987654, 321, "Junior Sampaio", 14500);
	}

}
