package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {
		
	Pessoa pessoaA = new Pessoa();
	pessoaA.setNome("Aiton");
	pessoaA.setIdade (39);
	
	Pessoa pessoaB = new Pessoa();
	pessoaA.setNome("Aiton");
	pessoaA.setIdade (39);
	
	System.out.println("Pessoa A é igail a Pessoa B?" +(pessoaA==pessoaB)); //false
	System.out.println("Pessoa A é igual a Pessoa B?"+ pessoaA.equals(pessoaB)); //true
	System.out.println("Hash pessoa A; "+ pessoaA.hashCode());
	System.out.println("Hash pessoa B; "+ pessoaB.hashCode());

	}

}
