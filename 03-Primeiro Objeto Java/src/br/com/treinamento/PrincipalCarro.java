package br.com.treinamento;

public class PrincipalCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.ano = 1989;
		carro1.cor = "marrom";
		carro1.marca = "Volksvagem";
		carro1.modelo = "voyage";
		
		System.out.println("Modelo do carro" +carro1.modelo);
		carro1.ligar();
		carro1.mostrarIdade();
		carro1.buzinar("Fom-Fom");
		carro1.desligar();
	}

}
